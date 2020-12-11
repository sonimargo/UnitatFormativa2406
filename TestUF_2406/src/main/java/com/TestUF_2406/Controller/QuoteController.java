package com.TestUF_2406.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TestUF_2406.Model.Book;
import com.TestUF_2406.Model.Quote;
import com.TestUF_2406.Service.BookService;
import com.TestUF_2406.Service.QuoteService;


@Controller
public class QuoteController 
{
	@Autowired
	QuoteService serviceQuote;

	@Autowired
	BookService serviceBook;
	
	
	@RequestMapping(value = { "gestionQuotes" })	
	public String listadoQuote(Model model) 
	{
		model.addAttribute("listaQuotes", serviceQuote.findAll());
		return "inicio/webQuotesListado.html";
	}
	
	
	
	@RequestMapping("/nuevaQuote")
	public String addQuote(Model model) 
	{
		//Rellenar combo de la web, listado de libros
		model.addAttribute("listaLibros", serviceBook.findAll());
		return "inicio/webQuoteNueva.html";
	}

	
	
	@RequestMapping("/insertarCita")
	public String insertQuote(Quote quote,  @RequestParam("libroId") Long IdLibro, Model model) 
	{
		
		Optional<Book> bookOptional =  serviceBook.findById(IdLibro);
		
		if (bookOptional.isPresent() )
		{
			quote.setBook(bookOptional.get());
			
			serviceQuote.insertQuote(quote);
			model.addAttribute("listaQuotes", serviceQuote.findAll());					
		}	
		else
			model.addAttribute("listaQuotes", serviceQuote.findAll());		

		return "inicio/webQuotesListado.html";
		
	}
	
}