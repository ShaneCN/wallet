package com.cobo.wallet.demos.api;

import com.cobo.wallet.demos.domain.wallet.model.UserAccountOptContext;
import com.cobo.wallet.demos.domain.wallet.service.UserAccountService;
import com.cobo.wallet.infras.enums.CurrencyEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.UUID;

@Controller
public class WalletController {

    @Resource
    private UserAccountService userAccountService;

    @RequestMapping(value = "/query/userid/{userId}/currency/{currency}", method = RequestMethod.GET)
    @ResponseBody
    public String query(@PathVariable("userId") String userId, @PathVariable("currency") String currency) throws Exception {
        return userAccountService.query(UserAccountOptContext.builder()
                .userId(userId)
                .currencyEnum(CurrencyEnum.getByName(currency))
                .bizNo(genBizNo())
                .build()).toString();
    }

    @RequestMapping(value = "/flowin/userid/{userId}/currency/{currency}/amount/{amount}", method = RequestMethod.GET)
    @ResponseBody
    public String flowIn(@PathVariable("userId") String userId, @PathVariable("currency") String currency, @PathVariable("amount") String amount) throws Exception {
        userAccountService.flowIn(UserAccountOptContext.builder()
                .userId(userId)
                .currencyEnum(CurrencyEnum.getByName(currency))
                        .amount(new BigDecimal(amount))
                .bizNo(genBizNo())
                .build());
        return userAccountService.query(UserAccountOptContext.builder()
                .userId(userId)
                .currencyEnum(CurrencyEnum.getByName(currency))
                .bizNo(genBizNo())
                .build()).toString();
    }

    @RequestMapping(value = "/flowout/userid/{userId}/currency/{currency}/amount/{amount}", method = RequestMethod.GET)
    @ResponseBody
    public String flowOut(@PathVariable("userId") String userId, @PathVariable("currency") String currency, @PathVariable("amount") String amount) throws Exception {
        userAccountService.flowOut(UserAccountOptContext.builder()
                .userId(userId)
                .currencyEnum(CurrencyEnum.getByName(currency))
                .amount(new BigDecimal(amount))
                .bizNo(genBizNo())
                .build());
        return userAccountService.query(UserAccountOptContext.builder()
                .userId(userId)
                .currencyEnum(CurrencyEnum.getByName(currency))
                .bizNo(genBizNo())
                .build()).toString();
    }

    private String genBizNo() {
        return UUID.randomUUID().toString();
    }

}
