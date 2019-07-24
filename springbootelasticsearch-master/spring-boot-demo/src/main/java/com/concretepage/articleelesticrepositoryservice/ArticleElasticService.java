package com.concretepage.articleelesticrepositoryservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.articleelasticrepository.IArticleElasticRepository;
import com.concretepage.entity.Article;

@Service
public class ArticleElasticService implements IArticleElasticService {

	
	@Autowired
	private IArticleElasticRepository articleRepo;
	
	
	@Override
	public void saveArticle(List<Article> entities) {
		articleRepo.save(entities);
	}

	@Override
	public Iterable<Article> findAllArticles() {
		return articleRepo.findAll();
	}


}
