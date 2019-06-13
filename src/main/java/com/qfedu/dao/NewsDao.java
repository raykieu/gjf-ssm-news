package com.qfedu.dao;

import com.qfedu.pojo.News;

import java.util.List;

/**
 * Created by Administrator on 2019/6/12.
 */

public interface NewsDao {
    List<News> selectAll(String keyword);

    void insertNews(News news);

    void deleteNews(Integer id);

    News findNewsById(Integer id);

    void updateNews(News news);
}
