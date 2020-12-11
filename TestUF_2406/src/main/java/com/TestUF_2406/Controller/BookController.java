package com.TestUF_2406.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TestUF_2406.Model.Book;
import com.TestUF_2406.Service.BookService;



@Controller
public class BookController 
{

	@Autowired
	BookService serviceBook;



	
	@RequestMapping(value = { "gestionBooks" })	
	public String listadoBooks(Model model) 
	{
		model.addAttribute("listaBooks", serviceBook.findAll());
		return "inicio/webLibrosListado.html";
	}
	
	
	@RequestMapping("/nuevoLibro")
	public String addBook(Model model) 
	{
		return "inicio/webLibroNuevo.html";
	}

	
		
	
	@RequestMapping("/insertarBook")
	public String insertBook(Book libro, Model model) 
	{
		
		serviceBook.insertBook(libro);
		model.addAttribute("listaBooks", serviceBook.findAll());		
		return "inicio/webLibrosListado.html";
		
	}

	
	
}


