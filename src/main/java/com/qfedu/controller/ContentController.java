package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Contents;
import com.qfedu.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/6/12.
 */

@Controller
@ResponseBody
public class ContentController {
    @Autowired
    private ContentService contentService;
    @RequestMapping("/content.do")
    public JsonBean selectContent(Integer id){
        List<Contents> list=contentService.selectContent(id);
        return new JsonBean(1,list);
    }
    @RequestMapping("/addcontent.do")
    public JsonBean addContent(Contents contents,Integer id){
        contentService.insertContent(contents,id);
        return new JsonBean(1,null);
    }
    @RequestMapping("/deletecontent.do")
    public JsonBean deleteContent(Integer id){
        contentService.deleteContent(id);
        return new JsonBean(1,null);
    }
}