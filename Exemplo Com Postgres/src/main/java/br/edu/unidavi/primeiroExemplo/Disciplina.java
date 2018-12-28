package br.edu.unidavi.primeiroExemplo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Disciplina {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nome;
    Integer cargaHoraria;
    Date dataInicio;
}
