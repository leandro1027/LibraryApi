package com.example.LibraryApi;

import com.example.LibraryApi.model.Autor;
import com.example.LibraryApi.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LibraryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApiApplication.class, args);
	}

	public static  void exemploSalvar (AutorRepository autorRepository) {
		Autor autor = new Autor();
		autor.setNome("Leandro");
		autor.setNascionalidade("Brasileiro");
		autor.setDataNascimento(LocalDate.of(2004, 8, 9));
		autorRepository.save(autor);
	}


}




