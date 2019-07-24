package com.concretepage.articleelasticrepository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.concretepage.entity.Article;

@Repository
public interface IArticleElasticRepository extends ElasticsearchRepository<Article, String> {


}
