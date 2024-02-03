package com.senai.apivsconnect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String matricula;
    private String nome;
    private String area;
    private String email;
    private DateTime dataNasc;
    private String funcao;
    private String sessao;
    private String face;

   //Referenciar sempre as tabelas do banco como  @ManytoONe
    @ManyToOne
    @JoinCollumn(name="id_TipoUsuario", referencedCollumnName = "id");





}