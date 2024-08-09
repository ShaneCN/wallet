package com.cobo.wallet.infras.enums;


import lombok.Getter;

public enum CurrencyEnum {

    CNY("CNY", "人民币"),

    USD("USD", "美金"),

    ;

    CurrencyEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Getter
    private final String name;

    private final String desc;


    public static CurrencyEnum getByName(String name) throws Exception {
        for (CurrencyEnum currencyEnum : CurrencyEnum.values()) {
            if (currencyEnum.getName().equalsIgnoreCase(name)) {
                return currencyEnum;
            }
        }
        throw new Exception("币种转换异常: " + name);
    }

}
