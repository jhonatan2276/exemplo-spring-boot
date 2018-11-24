package br.edu.unidavi.primeiroExemplo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoRestController {

    List<Aluno> alunos = new ArrayList<>();

    @PostConstruct
    public void init() {
        alunos.add(new Aluno(1l, "Mario", 12345,"email@email.com"));
        alunos.add(new Aluno(2l, "Fulano", 678910,"email@email.com"));
        alunos.add(new Aluno(3l, "Ciclano", 111212,"email@email.com"));
        alunos.add(new Aluno(4l, "João", 141516,"email@email.com"));
        alunos.add(new Aluno(5l, "Diana", 161718,"email@email.com"));
    }

    @GetMapping
    public List<Aluno> getAll() {
        return alunos;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAluno(@PathVariable Long id) {
        Optional<Aluno> aluno = alunos.stream().filter(c -> c.getId().equals(id)).findFirst();
        if (aluno.isPresent()) {
            return ResponseEntity.ok(aluno.get());
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Aluno> deleteAluno (@PathVariable Long id) {
        alunos.remove(id);
        return null;
    }
}
