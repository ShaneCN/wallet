package com.cobo.wallet.demos.domain.wallet.repo;

import com.cobo.wallet.demos.domain.wallet.model.UserAccount;
import com.cobo.wallet.demos.domain.wallet.model.UserAccountOptContext;
import com.cobo.wallet.infras.dao.entity.AccountOptFlowDO;
import com.cobo.wallet.infras.dao.entity.UserAccountDO;
import com.cobo.wallet.infras.dao.mapper.AccountOptFlowDOMapper;
import com.cobo.wallet.infras.dao.mapper.UserAccountDOMapper;
import com.cobo.wallet.infras.enums.OptTypeEnum;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

@Component
public class UserAccountRepoImpl implements UserAccountRepo {

    @Resource
    private UserAccountDOMapper userAccountDOMapper;

    @Resource
    private AccountOptFlowDOMapper accountOptFlowDOMapper;


    @Override
    public UserAccount queryByUserId(String userId) throws Exception {
        return UserAccount.fromDO(userAccountDOMapper.selectByUserId(userId));
    }

    @Override
    public UserAccount lockByUserId(String userId) throws Exception {
        return UserAccount.fromDO(userAccountDOMapper.lockByUserIdNoWait(userId));
    }

    @Override
    public void store(UserAccount account, String bizNo) throws Exception {
        UserAccountDO insertDO = UserAccount.toDO(account);
        if (Objects.isNull(insertDO)) {
            throw new Exception("尝试插入空记录");
        }
        userAccountDOMapper.insert(insertDO);
        UserAccountDO queryDO = userAccountDOMapper.selectByUserId(account.getUserId());

        AccountOptFlowDO accountOptFlowDO = new AccountOptFlowDO();
        accountOptFlowDO.setBizNo(bizNo);
        accountOptFlowDO.setAccountId(queryDO.getId().toString());
        accountOptFlowDO.setType(OptTypeEnum.INIT.getCode());
        accountOptFlowDO.setUserId(insertDO.getUserId());
        accountOptFlowDO.setCurrency(insertDO.getCurrency());
        accountOptFlowDO.setModifiedAmount(insertDO.getAmount());
        accountOptFlowDO.setAfterAmount(insertDO.getAmount());
        accountOptFlowDO.setGmtCreate(insertDO.getGmtCreate());
        accountOptFlowDO.setGmtModified(insertDO.getGmtModified());

        accountOptFlowDOMapper.insert(accountOptFlowDO);
    }

    @Override
    public void update(UserAccount account, UserAccountOptContext context, OptTypeEnum optType) throws Exception {
        UserAccountDO updateAccountDO = UserAccount.toDO(account);
        if (Objects.isNull(updateAccountDO)) {
            throw new Exception("更新记录不能为空");
        }
        AccountOptFlowDO accountOptFlowDO = new AccountOptFlowDO();
        accountOptFlowDO.setBizNo(context.getBizNo());
        accountOptFlowDO.setAccountId(updateAccountDO.getId().toString());
        accountOptFlowDO.setUserId(updateAccountDO.getUserId());
        accountOptFlowDO.setType(optType.getCode());
        accountOptFlowDO.setAfterAmount(updateAccountDO.getAmount());
        accountOptFlowDO.setCurrency(updateAccountDO.getCurrency());
        accountOptFlowDO.setModifiedAmount(context.getAmount());
        accountOptFlowDO.setGmtCreate(updateAccountDO.getGmtModified());
        accountOptFlowDO.setGmtModified(updateAccountDO.getGmtModified());

        userAccountDOMapper.updateByPrimaryKey(updateAccountDO);
        accountOptFlowDOMapper.insert(accountOptFlowDO);

    }
}
