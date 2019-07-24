package com.concretepage.elasticcontroller;

import java.io.IOException;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.articleelasticrepository.IArticleElasticRepository;
import com.concretepage.entity.Article;

@RestController
@RequestMapping(value= "/article")
public class ArticleElasticController {

	@Autowired
	private Client client;
	
	@Autowired
	private ElasticsearchTemplate elasticsearchTemplate;
	
	@Autowired
	private IArticleElasticRepository aserv;	

	@PostMapping("/create")
	public String create(@RequestBody Article article) throws IOException {
		if(elasticsearchTemplate.indexExists(Article.class)) {
			aserv.save(article);
		}else {
			elasticsearchTemplate.createIndex(Article.class);
			aserv.save(article);
		}
		
		return "Records saved in the db.";
	}
}
