package com.fr.investimentos.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.LinkedHashMap;

@FeignClient(name = "yahooFinanceFeign", url = "https://query1.finance.yahoo.com/v10/finance/")
public interface YahooFinanceFeignClient {

    @GetMapping("/quoteSummary/{symbol}?formatted=true&modules=price%2CsummaryDetail")
    LinkedHashMap get(@PathVariable("symbol") String symbol);

}

