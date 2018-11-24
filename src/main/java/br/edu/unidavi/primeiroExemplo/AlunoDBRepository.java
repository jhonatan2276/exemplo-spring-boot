package br.edu.unidavi.primeiroExemplo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlunoDBRepository extends JpaRepository<AlunoDB, Long> {

    List<AlunoDB> findByNomeContaining(String nome);

    /*@Query("SELECT a FROM AlunoDB a WHERE MONTH(a.dataNascimento) = :mes")
    List<AlunoDB> findByDataNascimentoAtMesCorrente(@Param("mes") Integer mes);*/
}
