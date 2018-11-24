package br.edu.unidavi.primeiroExemplo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Cliente2 {

    @Id @GeneratedValue
    Long id;
    String nome;
    String email;
}
