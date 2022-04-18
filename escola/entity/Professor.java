package com.gustavorosa.escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Professor extends Pessoa {
    private String codigo;
    @OneToOne
    private Disciplina disciplina;
}
