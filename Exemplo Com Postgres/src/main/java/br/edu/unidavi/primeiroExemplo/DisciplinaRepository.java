package br.edu.unidavi.primeiroExemplo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

@RepositoryRestResource (path = "disciplinas") //Essa anotação é opcional pq a classe já vai ser automaticamente exposta
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    /*URL de acesso a este item fica da seguinte forma:
    http://localhost:8081/disciplinas/search/nomes?nome=Mat*/
    @Secured("ROLE_ADMIN")
    @RestResource (path = "nomes")
    List<Disciplina> findByNomeContaining(@Param("nome") String nome);

    /*URL de acesso a este item fica da seguinte forma:
    http://localhost:8081/disciplinas/search/current*/
    @RestResource (path = "current")
    @Query("select d from Disciplina d where d.dataInicio > CURRENT_DATE")
    List<Disciplina> findByDatamaiorCurrentDate();

    /*Para fazer um POST / UPDATE ou DELETE em metodoso protegidos
    com o Postman, usar a aba Authorization > Basic Auth e passar o usuário e senha*/
}
