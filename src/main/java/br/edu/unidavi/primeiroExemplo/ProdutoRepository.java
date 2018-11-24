package br.edu.unidavi.primeiroExemplo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource (path = "/produtos")
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}