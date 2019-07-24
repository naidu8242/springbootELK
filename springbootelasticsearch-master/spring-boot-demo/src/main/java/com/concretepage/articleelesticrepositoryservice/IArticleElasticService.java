package com.concretepage.articleelesticrepositoryservice;

import java.util.List;

import com.concretepage.entity.Article;

public interface IArticleElasticService {

	/**
	 * Method to save the collection of articles in the database.
	 * 
	 * @param articles
	 */
	public void saveArticle(List<Article> article);

	/**
	 * Method to fetch all articles from the database.
	 * 
	 * @return
	 */
	public Iterable<Article> findAllArticles();

	
}
