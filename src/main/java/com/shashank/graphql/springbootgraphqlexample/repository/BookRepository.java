package com.shashank.graphql.springbootgraphqlexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.graphql.springbootgraphqlexample.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
