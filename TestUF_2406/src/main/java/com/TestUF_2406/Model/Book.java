package com.TestUF_2406.Model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIBROS")
public class Book 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "IDBOOK")
	private Long idBook;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private List<Quote> listaQuotes = new ArrayList<>();

	
	
	public Book() 
	{
		// TODO Auto-generated constructor stub
	}

	
	public Book(String titulo) 
	{
		this.titulo = titulo;
	}


	public Long getIdBook() {
		return idBook;
	}


	public void setIdBook(Long idBook) 	{
		this.idBook = idBook;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", titulo=" + titulo + "]";
	}

	
	
	
}
