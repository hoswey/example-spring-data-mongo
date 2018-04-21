package com.example.spring.mongo.demo.repository;

/**
 * @author hoswey
 */
public interface CustomizedArticleRepository {

  long countByAuthor(String author);
}
