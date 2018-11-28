package com.fr.investimentos.controller;

import com.fr.investimentos.model.Ativo;
import com.fr.investimentos.repository.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("ativo")
public class AtivoController {

    @Autowired
    private BasicRepository repository;

    @PostMapping
    public ResponseEntity post(@RequestBody Ativo ativo) {
        repository.save(ativo);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(repository.findAll(Ativo.class));
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity delete(@PathVariable("id") String id) {
        repository.remove(Ativo.class, id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "{id}")
    public ResponseEntity put(@PathVariable("id") String id, @RequestBody Ativo ativo) {
        repository.save(ativo);
        return ResponseEntity.ok(ativo);
    }

}
