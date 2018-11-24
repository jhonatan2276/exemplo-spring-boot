package br.edu.unidavi.primeiroExemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunodb")
public class AlunoDBRestController {

    @Autowired
    AlunoDBRepository repository;

    @GetMapping
    public List<AlunoDB> getAll () {
        return repository.findAll();
    }

    @GetMapping("/{nome}")
    public List<AlunoDB> getByNome (@PathVariable String nome) {
        return repository.findByNomeContaining(nome);
    }
}
