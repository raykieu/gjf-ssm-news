package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.News;
import com.qfedu.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/6/12.
 */


@Controller
@ResponseBody
public class Newsontroller {
    @Autowired
    private NewsService newsService;
    @RequestMapping("/list.do")
    public JsonBean findAll(String keyword){
        List<News> list=newsService.findAll(keyword);
        //System.out.println(list);
        return new JsonBean(1,list);
    }
    @RequestMapping("/add.do")
    public JsonBean addNews(News news){
        newsService.insertNews(news);
        return new JsonBean(1,null);
    }
    @RequestMapping("/delete.do")
    public JsonBean deleteNews(Integer id){
        newsService.deleteNews(id);
        return new JsonBean(1,null);
    }
    @RequestMapping("/query.do")
    public JsonBean findNewsById(Integer id){
       News news=newsService.findNewsById(id);

        return new JsonBean(1,news);
    }
    @RequestMapping("/update.do")
    public JsonBean updateNews(News news){
        newsService.updateNews(news);
        return new JsonBean(1,null);
    }
}