package com.cobo.wallet.demos.domain.wallet.model;

import com.cobo.wallet.infras.dao.entity.UserAccountDO;
import com.cobo.wallet.infras.enums.CurrencyEnum;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Data
@Builder
public class UserAccount implements Serializable {

    /** 主键ID */
    private Long id;

    /** 用户ID */
    private String userId;

    /** 金额 */
    private BigDecimal amount;

    /** 币种 */
    private CurrencyEnum currency;

    /** 创建时间 */
    private Date gmtCreate;

    /** 修改时间 */
    private Date gmtModified;

    /**
     * 增加账户额度
     *
     * @param modiAmount 增加额度
     */
    public void increase(BigDecimal modiAmount) {
        this.amount = this.amount.add(modiAmount);
        this.gmtModified = new Date();
    }

    /**
     * 扣减账户额度
     *
     * @param modiAmount 扣减额度
     * @throws Exception 超支时抛异常
     */
    public void decrese(BigDecimal modiAmount) throws Exception {
        if (this.amount.compareTo(modiAmount) < 0) {
            throw new Exception("额度不足");
        }

        this.amount = this.amount.subtract(modiAmount);
        this.gmtModified = new Date();
    }

    public static UserAccount fromDO(UserAccountDO userAccountDO) throws Exception {
        if (Objects.isNull(userAccountDO)) {
            return null;
        }
        UserAccount userAccount = UserAccount.builder().build();
        userAccount.setId(userAccountDO.getId());
        userAccount.setUserId(userAccountDO.getUserId());
        userAccount.setCurrency(CurrencyEnum.getByName(userAccountDO.getCurrency()));
        userAccount.setAmount(userAccountDO.getAmount());
        userAccount.setGmtCreate(userAccountDO.getGmtCreate());
        userAccount.setGmtModified(userAccountDO.getGmtModified());

        return userAccount;
    }

    /**
     * 模型转换
     *
     * @param userAccount
     * @return
     */
    public static UserAccountDO toDO(UserAccount userAccount) {
        if (Objects.isNull(userAccount)) {
            return null;
        }
        return UserAccountDO.builder()
                .id(userAccount.getId())
                .userId(userAccount.getUserId())
                .currency(userAccount.getCurrency().getName())
                .amount(userAccount.getAmount())
                .gmtCreate(userAccount.getGmtCreate())
                .gmtModified(userAccount.getGmtModified())
                .build();
    }


}
