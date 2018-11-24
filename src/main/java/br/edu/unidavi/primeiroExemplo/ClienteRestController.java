package br.edu.unidavi.primeiroExemplo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    List<Cliente> clientes = new ArrayList<>();

    @PostConstruct
    public void init() {
        clientes.add(new Cliente(1l, "João", "joao@email.com"));
        clientes.add(new Cliente(2l, "Mario", "joao@email.com"));
        clientes.add(new Cliente(3l, "Mario", "joao@email.com"));
        clientes.add(new Cliente(4l, "Fulano", "joao@email.com"));
    }

    @GetMapping
    public List<Cliente> getAll() {
        return clientes;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long id) {
        Optional<Cliente> cliente = clientes.stream().filter(c -> c.getId().equals(id)).findFirst();
        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        } else {
            return null;
        }
    }
}
