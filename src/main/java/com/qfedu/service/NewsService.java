package com.qfedu.service;

import com.qfedu.pojo.News;

import java.util.List;

/**
 * Created by Administrator on 2019/6/12.
 */
public interface NewsService {


    List<News> findAll(String keyword);

    void insertNews(News news);

    void deleteNews(Integer id);

    News findNewsById(Integer id);

    void updateNews(News news);
}
