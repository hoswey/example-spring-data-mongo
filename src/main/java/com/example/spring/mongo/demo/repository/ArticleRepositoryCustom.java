package com.example.spring.mongo.demo.repository;

/**
 * @author hoswey
 */
public interface ArticleRepositoryCustom {

  int countByAuthor(String author);
}
