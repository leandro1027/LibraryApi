package com.example.LibraryApi;

import com.example.LibraryApi.model.Autor;
import com.example.LibraryApi.model.GeneroLivro;
import com.example.LibraryApi.model.Livro;
import com.example.LibraryApi.repository.AutorRepository;
import com.example.LibraryApi.repository.LivroRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class LibraryApiApplication {

	public static void main(String[] args){
		var context = SpringApplication.run(LibraryApiApplication.class, args);
	}




}




