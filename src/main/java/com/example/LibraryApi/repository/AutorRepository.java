package com.example.LibraryApi.repository;

import com.example.LibraryApi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {

}
