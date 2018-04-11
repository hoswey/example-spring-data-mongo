package com.example.spring.mongo.demo.repository;

import javax.annotation.Resource;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * @author hoswey
 */
public class ArticleRepositoryImpl implements ArticleRepositoryCustom {

  @Resource
  private MongoOperations mongoOperations;

  @Override
  public int countByAuthor(String author) {
    return 0;
  }
}
