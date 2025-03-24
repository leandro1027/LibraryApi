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
		AutorRepository autorRepository = context.getBean(AutorRepository.class);
		LivroRepository livroRepository = context.getBean(LivroRepository.class);

		exemploSalvarAutor(autorRepository);
		exemploSalvarLivro(livroRepository, autorRepository);
	}

	public static  void exemploSalvarAutor (AutorRepository autorRepository) {
		Autor autor = new Autor();
		autor.setNome("Leandro");
		autor.setNascionalidade("Brasileiro");
		autor.setDataNascimento(LocalDate.of(2004, 8, 9));
		var autorSalvo = autorRepository.save(autor);

		System.out.println("Autor salvo: " + autorSalvo);

	}

	public static void exemploSalvarLivro(LivroRepository livroRepository, AutorRepository autorRepository) {
		// Buscar um autor existente
		Autor autor = autorRepository.findById(UUID.fromString("ebfaaec3-2f7e-4dde-8bf0-6702c225147e")).orElse(null);

		Livro livro = new Livro();
		livro.setAutor(autor);
		livro.setGenero(GeneroLivro.ANIMAÇÃO);
		livro.setDataPublicacao(LocalDate.of(2025, 3, 24));

		var livroSalvo = livroRepository.save(livro);
		System.out.println("Livro salvo: " + livroSalvo);
	}



}




