package com.cobo.wallet.infras.enums;

import lombok.Getter;

@Getter
public enum OptTypeEnum {
    /** 初始化账户 */
    INIT("INIT"),

    /** 额度记增 */
    INCRE("INCRE"),

    /** 额度扣减 */
    DECRE("DECRE"),

    ;

    private final String code;

    OptTypeEnum(String code) {
        this.code = code;
    }
}
