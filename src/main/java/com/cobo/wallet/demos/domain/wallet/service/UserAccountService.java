package com.cobo.wallet.demos.domain.wallet.service;

import com.cobo.wallet.demos.domain.wallet.model.UserAccount;
import com.cobo.wallet.demos.domain.wallet.model.UserAccountOptContext;

public interface UserAccountService {

    /**
     * 账户信息查询
     *
     * @param context 限界上下文
     * @return 查询结果
     * @throws Exception 查询异常
     */
    UserAccount query(UserAccountOptContext context) throws Exception;

    /**
     * 资产流入
     *
     * @param context 限界上下文
     * @throws Exception 流入异常
     */
    void flowIn(UserAccountOptContext context) throws Exception;

    /**
     * 资产流出
     *
     * @param context 限界上下文
     * @throws Exception 流出异常
     */
    void flowOut(UserAccountOptContext context) throws Exception;
}
