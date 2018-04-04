package com.example.spring.mongo.demo.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author hoswey
 */
@Document(collection = "article")
@Getter
@Setter
public class Article {

  @Id
  private String id;

  private String author;

  private String title;
}
