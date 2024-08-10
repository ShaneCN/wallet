package com.cobo.wallet.demos.domain.wallet.service;

import com.cobo.wallet.demos.domain.wallet.model.UserAccount;
import com.cobo.wallet.demos.domain.wallet.model.UserAccountOptContext;
import com.cobo.wallet.demos.domain.wallet.repo.UserAccountRepo;
import com.cobo.wallet.infras.enums.OptTypeEnum;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Component
public class UserAccountServiceImpl implements UserAccountService {

    /** 用户账户repo */
    @Resource
    private UserAccountRepo userAccountRepo;

    /** 事务模板 */
    @Resource
    private TransactionTemplate transactionTemplate;

    /**
     * @see UserAccountService#query(UserAccountOptContext)
     */
    @Override
    public UserAccount query(UserAccountOptContext context) throws Exception {
        if (Objects.isNull(context) || StringUtils.isEmpty(context.getUserId())) {
            throw new Exception("查询入参为空");
        }

        return queryWithCreate(context);
    }

    /**
     * @see UserAccountService#flowIn(UserAccountOptContext) 
     */
    @Override
    public void flowIn(UserAccountOptContext context) throws Exception {

        checkParam(context);

        // 1.校验账户是否存在
        UserAccount queryAccount = queryWithCreate(context);

        // 2. 额度记增
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                try {
                    doIncreaseWithThrow(context);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    /**
     * @see UserAccountService#flowOut(UserAccountOptContext)
     */
    @Override
    public void flowOut(UserAccountOptContext context) throws Exception {

        checkParam(context);

        // 1.校验账户是否存在
        UserAccount queryAccount = queryWithThrow(context);

        // 2.额度记减
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                try {
                    doDecreaseWithThrow(context);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    /**
     * 查询账户，不存在时，抛异常
     *
     * @param context 限界上下文
     * @return 账户
     * @throws Exception 账户不存在时，抛异常
     */
    private UserAccount queryWithThrow(UserAccountOptContext context) throws Exception {
        UserAccount queryAccount = userAccountRepo.queryByUserId(context.getUserId(), context.getCurrencyEnum());
        if (Objects.isNull(queryAccount)) {
            throw new Exception("账户不存在");
        }
        return queryAccount;
    }

    /**
     * 查询账户，不存在时，构造一个
     *
     * @param context 限界上下文
     * @return 账户信息
     * @throws Exception
     */
    private UserAccount queryWithCreate(UserAccountOptContext context) throws Exception {

        UserAccount queryAccount = userAccountRepo.queryByUserId(context.getUserId(), context.getCurrencyEnum());

        if (Objects.nonNull(queryAccount)) {
            return queryAccount;
        }

        userAccountRepo.store(
                UserAccount.builder()
                        .userId(context.getUserId())
                        .amount(BigDecimal.ZERO)
                        .currency(context.getCurrencyEnum())
                        .gmtCreate(new Date())
                        .gmtModified(new Date())
                        .build()
                , context.getBizNo());

        return userAccountRepo.queryByUserId(context.getUserId(), context.getCurrencyEnum());
    }

    /**
     * 资产记增，无事务
     *
     * @param context 界限上下文
     * @throws Exception
     */
    private void doIncreaseWithThrow(UserAccountOptContext context) throws Exception {
        // 1. 加锁
        UserAccount userAccount = userAccountRepo.lockByUserId(context.getUserId(), context.getCurrencyEnum());

        // 2. 判断数据是否合法
        if (Objects.isNull(userAccount)) {
            throw new Exception("账户不存在");
        }

        // 3. 更新数据
        userAccount.increase(context.getAmount());
        userAccountRepo.update(userAccount, context, OptTypeEnum.INCRE);
    }

    /**
     * 资产记减
     *
     * @param context
     * @throws Exception
     */
    private void doDecreaseWithThrow(UserAccountOptContext context) throws Exception {
        // 1. 加锁
        UserAccount userAccount = userAccountRepo.lockByUserId(context.getUserId(), context.getCurrencyEnum());

        // 2. 判断数据是否合法
        if (Objects.isNull(userAccount)) {
            throw new Exception("账户不存在");
        }

        // 3. 更新数据
        userAccount.decrese(context.getAmount());
        userAccountRepo.update(userAccount, context, OptTypeEnum.DECRE);
    }

    private void checkParam(UserAccountOptContext context) throws Exception {

        if (Objects.isNull(context)) {
            throw new Exception("content为空");
        }
        if (StringUtils.isEmpty(context.getUserId())) {
            throw new Exception("用户名为空");
        }

        if (Objects.isNull(context.getCurrencyEnum())) {
            throw new Exception("币种为空");
        }

        if (StringUtils.isEmpty(context.getAmount())) {
            throw new Exception("金额为空");
        }

    }

}
