package com.example.spring.mongo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author hoswey
 */
public interface ArticleRepository extends MongoRepository<Article, String>,
    ArticleRepositoryCustom {

  Article findByAuthor(String author);
}
