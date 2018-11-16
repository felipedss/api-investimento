package com.fr.investimentos.controller;

import com.fr.investimentos.feign.YahooFinanceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cotacao")
public class CotacaoController {

    @Autowired
    private YahooFinanceFeignClient feignClient;

    @GetMapping(path = "{symbol}")
    public ResponseEntity findBySymbol(@PathVariable("symbol") String symbol) {
        return ResponseEntity.ok(feignClient.callFeignClient().findBySymbol(symbol));
    }

}
