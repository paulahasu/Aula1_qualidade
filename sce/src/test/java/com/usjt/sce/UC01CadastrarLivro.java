package com.usjt.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usjt.sce.model.Livro;

public class UC01CadastrarLivro {
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT02CadastrarLivroComISBNBranco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN inválido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarLivroComISBNBranco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_nulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN inválido", e.getMessage());
		}
	}

	@Test
	public void CT04CadastrarLivroComISBNBranco() {
	// cenario
	Livro umLivro = new Livro();
	// acao
	umLivro = ObtemLivro.comDadosValidos();
	
// verificacao
		assertEquals("121212",umLivro.getIsbn());
	}

@Test
public void CT05CadastrarLivroComISBNBranco() {
// cenario
Livro umLivro = new Livro();
// acao
umLivro = ObtemLivro.comDadosValidos();

//verificacao
	assertEquals("Engenharia de Software",umLivro.getTitulo());
}
	@Test
	public void CT06CadastrarLivroComISBNBranco() {
	// cenario
	Livro umLivro = new Livro();
	// acao
	umLivro = ObtemLivro.comDadosValidos();

	//verificacao
		assertEquals("Pressman",umLivro.getAutor());
	}
}



