package com.fr.investimentos.feign;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class YahooFinanceFeignClient extends FeignClient {

    private static String URL = "https://query1.finance.yahoo.com/v10/finance/";

    public YahooFinanceClient callFeignClient() {
        return createClient(YahooFinanceClient.class, URL);
    }

}