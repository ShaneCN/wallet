package com.cobo.wallet.demos.domain.wallet.service;

import com.cobo.wallet.demos.domain.wallet.model.UserAccount;
import com.cobo.wallet.demos.domain.wallet.model.UserAccountOptContext;

public interface UserAccountService {
    UserAccount query(UserAccountOptContext context) throws Exception;

    void flowIn(UserAccountOptContext context) throws Exception;

    void flowOut(UserAccountOptContext context) throws Exception;
}
