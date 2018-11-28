package com.fr.investimentos.controller;

import com.fr.investimentos.repository.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("operacao-acoes")
public class OperacaoAcoes {

    @Autowired
    private BasicRepository repository;

    @PostMapping
    public ResponseEntity post(@RequestBody com.fr.investimentos.model.OperacaoAcoes operacaoAcoes) {
        repository.save(operacaoAcoes);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(repository.findAll(com.fr.investimentos.model.OperacaoAcoes.class));
    }

}
