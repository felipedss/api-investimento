package com.fr.investimentos.controller;

import com.fr.investimentos.model.OperacaoBolsaValores;
import com.fr.investimentos.repository.BasicRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
@RequestMapping("operacao-bolsa-valores")
public class OperacaoBolsaValoresController {

    @Inject
    private BasicRepository repository;

    @PostMapping
    public ResponseEntity post(@RequestBody OperacaoBolsaValores operacaoBolsaValores) {
        repository.save(operacaoBolsaValores);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(repository.findAll(OperacaoBolsaValores.class));
    }

}
