package com.example.spring.mongo.demo.repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import javax.annotation.Resource;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;

/**
 * @author hoswey
 */
public class CustomizedArticleRepositoryImpl implements CustomizedArticleRepository {

  @Resource
  private MongoOperations mongoOperations;

  @Override
  public long countByAuthor(String author) {
    return mongoOperations.count(
        Query.query(where("author").is(author)),
        Article.class
    );
  }
}
