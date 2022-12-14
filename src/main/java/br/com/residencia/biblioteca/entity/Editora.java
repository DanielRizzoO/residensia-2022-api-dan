package br.com.residencia.biblioteca.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "editora")
public class Editora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigoeditora")
	private Integer codigoEditora;
	
	@Column (name = "nome")
	private String nome;
	
	@OneToMany (mappedBy = "editora")
	private Set<Livro> livro;
	

	public Set<Livro> getLivros() {
		return livro;
	}

	public void setLivros(Set<Livro> livros) {
		this.livro = livros;
	}

	public Set<Livro> getLivro() {
		return livro;
	}

	public void setLivro(Set<Livro> livro) {
		this.livro = livro;
	}

	public Integer getCodigoEditora() {
		return codigoEditora;
	}

	public void setCodigoEditora(Integer codigoEditora) {
		this.codigoEditora = codigoEditora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}

