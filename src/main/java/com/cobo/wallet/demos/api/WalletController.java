package com.cobo.wallet.demos.api;

import com.cobo.wallet.demos.domain.wallet.model.UserAccount;
import com.cobo.wallet.demos.domain.wallet.model.UserAccountOptContext;
import com.cobo.wallet.demos.domain.wallet.service.UserAccountService;
import com.cobo.wallet.infras.dao.entity.AccountOptFlowDO;
import com.cobo.wallet.infras.dao.mapper.AccountOptFlowDOMapper;
import com.cobo.wallet.infras.enums.CurrencyEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Controller
public class WalletController {

    /** 用户账户服务 */
    @Resource
    private UserAccountService userAccountService;

    /** 账户流水表mapper */
    @Resource
    private AccountOptFlowDOMapper accountOptFlowDOMapper;

    /** 操作成功信息 */
    private static final String sucMsg = "操作成功";

    /**
     * 账户查询接口
     *
     * @param userId 用户id
     * @param currency 币种
     * @return 查询结果
     */
    @RequestMapping(value = "/query/userid/{userId}/currency/{currency}", method = RequestMethod.GET)
    @ResponseBody
    public Result<UserAccount> query(@PathVariable("userId") String userId, @PathVariable("currency") String currency) {
        Result<UserAccount> result = new Result<>();
        try {
            UserAccount queryAccount = userAccountService.query(UserAccountOptContext.builder()
                    .userId(userId)
                    .currencyEnum(CurrencyEnum.getByName(currency))
                    .bizNo(genBizNo())
                    .build());
            result.success(sucMsg, queryAccount);
        } catch (Exception e) {
            result.fail(e.getMessage());
        }
        return result;
    }

    /**
     * 查询记录
     *
     * @param userId 用户id
     * @param currency 币种
     * @return 交易记录
     */
    @RequestMapping(value = "/queryrecords/userid/{userId}/currency/{currency}", method = RequestMethod.GET)
    @ResponseBody
    public Result<List<AccountOptFlowDO>> queryRecords(@PathVariable("userId") String userId, @PathVariable("currency") String currency) {
        Result<List<AccountOptFlowDO>> result = new Result<>();
        try {
            List<AccountOptFlowDO> accountOptFlowDOS = accountOptFlowDOMapper.selectByUserIdAndCurrency(userId, currency);
            result.success(sucMsg, accountOptFlowDOS);
        } catch (Exception e) {
            result.fail(e.getMessage());
        }
        return result;
    }

    /**
     * 流入
     * @param userId 用户id
     * @param currency 币种
     * @param amount 金额
     * @return 用户账户最新结果，并发时可能不等于流入结果
     */
    @RequestMapping(value = "/flowin/userid/{userId}/currency/{currency}/amount/{amount}", method = RequestMethod.GET)
    @ResponseBody
    public Result<UserAccount> flowIn(@PathVariable("userId") String userId, @PathVariable("currency") String currency, @PathVariable("amount") String amount) {
        Result<UserAccount> result = new Result<>();
        try {

            userAccountService.flowIn(UserAccountOptContext.builder()
                    .userId(userId)
                    .currencyEnum(CurrencyEnum.getByName(currency))
                    .amount(new BigDecimal(amount))
                    .bizNo(genBizNo())
                    .build());
            UserAccount queryAccount = userAccountService.query(UserAccountOptContext.builder()
                    .userId(userId)
                    .currencyEnum(CurrencyEnum.getByName(currency))
                    .bizNo(genBizNo())
                    .build());
            result.success(sucMsg, queryAccount);

        } catch (Exception e) {
            result.fail(e.getMessage());
        }
        return result;
    }

    /**
     * 流出
     *
     * @param userId 用户id
     * @param currency 币种
     * @param amount 金额
     * @return 结果
     */
    @RequestMapping(value = "/flowout/userid/{userId}/currency/{currency}/amount/{amount}", method = RequestMethod.GET)
    @ResponseBody
    public Result<UserAccount> flowOut(@PathVariable("userId") String userId, @PathVariable("currency") String currency, @PathVariable("amount") String amount) {
        Result<UserAccount> result = new Result<>();
        try {
            userAccountService.flowOut(UserAccountOptContext.builder()
                    .userId(userId)
                    .currencyEnum(CurrencyEnum.getByName(currency))
                    .amount(new BigDecimal(amount))
                    .bizNo(genBizNo())
                    .build());
            UserAccount queryAccount = userAccountService.query(UserAccountOptContext.builder()
                    .userId(userId)
                    .currencyEnum(CurrencyEnum.getByName(currency))
                    .bizNo(genBizNo())
                    .build());
            result.success(sucMsg, queryAccount);
        } catch (Exception e) {
            result.fail(e.getMessage());
        }
        return result;
    }

    /**
     * 生成业务流水号，用于幂等
     *
     * @return 幂等号
     */
    private String genBizNo() {
        return UUID.randomUUID().toString();
    }

}
