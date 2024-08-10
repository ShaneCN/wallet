package com.cobo.wallet.demos.domain.wallet.model;

import com.cobo.wallet.infras.enums.CurrencyEnum;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class UserAccountOptContext {

    /** 用户id */
    private String userId;

    /** 币种 */
    private CurrencyEnum currencyEnum;

    /** 金额 */
    private BigDecimal amount;

    /** 业务单据号 */
    private String bizNo;

}
