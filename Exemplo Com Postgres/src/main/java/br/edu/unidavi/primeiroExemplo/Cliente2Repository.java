package br.edu.unidavi.primeiroExemplo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Cliente2Repository extends JpaRepository<Cliente2, Long> {

    List<Cliente2> findByNomeContaining(String nome);
}
