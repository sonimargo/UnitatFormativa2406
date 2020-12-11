package com.TestUF_2406.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.TestUF_2406.Model.Quote;



public interface QuoteRepository extends CrudRepository<Quote, Long> 
{ 

	Optional<Quote> findById(long id);
	
}
