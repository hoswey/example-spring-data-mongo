package com.example.spring.mongo.demo.repository;

/**
 * @author hoswey
 */
public interface CustomizedArticleRepository {

  int countByAuthor(String author);
}
