package com.TestUF_2406.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestUF_2406.Model.Book;
import com.TestUF_2406.Repository.BookRepository;



@Service
public class BookService 
{

	@Autowired
	BookRepository repositorioBook;
	
	
	
	public Iterable<Book> findAll() 
	{
		return repositorioBook.findAll();
	}

	public Optional<Book> findById (long id) 
	{
		return repositorioBook.findById(id);
	}


	public void insertBook(Book book) 
	{
		repositorioBook.save(book);
	}
	

}