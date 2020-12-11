package com.TestUF_2406.Model;

import javax.persistence.Column;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "QUOTES")

public class Quote 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "IDQUOTE")
	private Long idQuote;
	
	@Column(name = "CITA")
	private String cita;
		
	@ManyToOne
	@JoinColumn (name = "FK_BOOK_ID")
	private Book book;
	
	
	public Quote() 
	{
		super();
	}


	public Quote(String cita, Book book) {
		super();
		this.cita = cita;
		this.book = book;
	}


	public Long getIdQuote() {
		return idQuote;
	}


	public void setIdQuote(Long idQuote) {
		this.idQuote = idQuote;
	}


	public String getCita() {
		return cita;
	}


	public void setCita(String cita) {
		this.cita = cita;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	@Override
	public String toString() {
		return "Quote [idQuote=" + idQuote + ", cita=" + cita + ", book=" + book + "]";
	}

	
	
	
}
