package com.TestUF_2406.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.TestUF_2406.Model.Book;



public interface BookRepository extends CrudRepository<Book,Long> 
{
	Optional<Book> findById(long id);
	
}