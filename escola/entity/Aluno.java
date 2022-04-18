package com.gustavorosa.escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Aluno extends Pessoa {
    private String matricula;
    @ManyToMany
    private List<Disciplina> disciplinas;
    @ManyToMany
    private List<Professor> professores;
}
