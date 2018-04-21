package com.example.spring.mongo.demo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author hoswey
 */
public interface ArticleRepository extends MongoRepository<Article, String>,
    CustomizedArticleRepository {

  List<Article> findByAuthorOrderByIdDescAllIgnoreCase(String author);

  List<Article> findByNumOfLikeIsGreaterThan(int numOfLike);
}
