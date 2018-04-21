package com.example.spring.mongo.demo;

import com.example.spring.mongo.demo.repository.Article;
import com.example.spring.mongo.demo.repository.ArticleRepository;
import javax.annotation.Resource;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.Assert;

@SpringBootApplication
public class DemoApplication implements InitializingBean {

  @Resource
  private ArticleRepository articleRepository;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void afterPropertiesSet() throws Exception {

    String author = "abc";
    String title = "hello";

    Article article = new Article();
    article.setAuthor(author);
    article.setTitle(title);

    articleRepository.insert(article);

    Article article1 = articleRepository.findByAuthorOrderByIdDescAllIgnoreCase(author, PageRequest.of(0, 100)).getContent().get(0);

    Assert.isTrue(article1.getTitle().equals(title), "");

  }
}
