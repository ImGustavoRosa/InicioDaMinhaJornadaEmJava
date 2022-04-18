package com.gustavorosa.escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column
    private String nome;
    private String dataNascimento;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //metódo
    /*    public void sacarDinheiro(double valor){
            this.saldo = this.saldo - valor;
        }*/

}
