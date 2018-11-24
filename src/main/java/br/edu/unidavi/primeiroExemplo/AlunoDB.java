package br.edu.unidavi.primeiroExemplo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;

@Data
@Entity
public class AlunoDB {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nome;
    Integer matricula;
    String email;
    Date dataNascimento;
}
