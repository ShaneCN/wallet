package com.cobo.wallet.demos.domain.wallet.repo;

import com.cobo.wallet.demos.domain.wallet.model.UserAccount;
import com.cobo.wallet.demos.domain.wallet.model.UserAccountOptContext;
import com.cobo.wallet.infras.enums.CurrencyEnum;
import com.cobo.wallet.infras.enums.OptTypeEnum;

public interface UserAccountRepo {

    /**
     * 根据用户id查询额度账户
     *
     * @param userId 用户id
     * @return 额度账户
     */
    UserAccount queryByUserId(String userId, CurrencyEnum currencyEnum) throws Exception;

    /**
     * 根据用户id加锁
     * 锁冲突立即返回
     *
     * @param userId 用户id
     * @return 额度账户
     */
    UserAccount lockByUserId(String userId, CurrencyEnum currencyEnum) throws Exception;

    /**
     * 插入新的额度账户，并记流水
     *
     * @param account 额度账户
     */
    void store(UserAccount account, String bizNo) throws Exception;

    /**
     * 更新额度账户，并记流水
     *
     * @param account 额度账户
     */
    void update(UserAccount account, UserAccountOptContext context, OptTypeEnum optType) throws Exception;



}
