package com.example.LibraryApi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;
}
