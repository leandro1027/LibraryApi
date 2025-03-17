package com.example.LibraryApi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name= "Autor", schema = "public")
@Getter
@Setter
public class Autor {

    @Id
    @Column(name = "id", length = 100, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "nascionalidade", length = 50, nullable = false)
    private String nascionalidade;

}
