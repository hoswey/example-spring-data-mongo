package com.example.spring.mongo.demo.repository;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author hoswey
 */
public interface ArticleRepository extends MongoRepository<Article, String>,
    CustomizedArticleRepository {

  Page<Article> findByAuthorOrderByIdDescAllIgnoreCase(String author, Pageable pageable);

  List<Article> findByNumOfLikeIsGreaterThan(int numOfLike);
}
