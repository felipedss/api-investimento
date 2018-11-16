package com.fr.investimentos.feign;

import feign.Param;
import feign.RequestLine;

public interface YahooFinanceClient {

    @RequestLine("GET /quoteSummary/{symbol}?formatted=true&modules=price")
    Object findBySymbol(@Param("symbol") String symbol);

}