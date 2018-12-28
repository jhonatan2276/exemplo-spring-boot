package br.edu.unidavi.primeiroExemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes2")
public class Cliente2ResrtControleller {

    @Autowired
    Cliente2Repository repo;

    @GetMapping("/nome/{nome}")
    public List<Cliente2> getAll(@PathVariable String nome) {
        return repo.findByNomeContaining(nome);
    };

    @PostMapping
    public Cliente2 create (@RequestBody Cliente2 cliente2) {
        return repo.save(cliente2);
    };
}