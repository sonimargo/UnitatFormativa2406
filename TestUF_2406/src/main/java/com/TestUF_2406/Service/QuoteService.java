package com.TestUF_2406.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestUF_2406.Model.Quote;
import com.TestUF_2406.Repository.QuoteRepository;


@Service
public class QuoteService 
{

	@Autowired
	QuoteRepository repositorioQuote;
	
	
	
	public Iterable<Quote> findAll() 
	{
		return repositorioQuote.findAll();
	}

	public Optional<Quote> findById (long id) 
	{
		return repositorioQuote.findById(id);
	}


	public void insertQuote(Quote quote) 
	{
		repositorioQuote.save(quote);
	}

	
}