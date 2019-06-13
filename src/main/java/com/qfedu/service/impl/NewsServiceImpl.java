package com.qfedu.service.impl;

import com.qfedu.dao.NewsDao;
import com.qfedu.pojo.News;
import com.qfedu.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/6/12.
 */

@Service
public class NewsServiceImpl implements NewsService{
    @Autowired
    private NewsDao newsDao;
    @Override
    public List<News> findAll(String keyword) {
        return newsDao.selectAll(keyword);
    }

    @Override
    public void insertNews(News news) {
        news.setCreatedate(new Date());
        newsDao.insertNews(news);
    }

    @Override
    public void deleteNews(Integer id) {
        newsDao.deleteNews(id);
    }

    @Override
    public News findNewsById(Integer id) {
        return newsDao.findNewsById(id);
    }

    @Override
    public void updateNews(News news) {
        newsDao.updateNews(news);
    }
}