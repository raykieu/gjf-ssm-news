package com.qfedu.service.impl;

import com.qfedu.dao.ContentDao;
import com.qfedu.pojo.Contents;
import com.qfedu.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/12.
 */

@Service
public class ContentServiceImpl implements ContentService{
    @Autowired
    private ContentDao contentdao;

    @Override
    public List<Contents> selectContent(Integer id) {
        return contentdao.selectContent(id);
    }

    @Override
    public void insertContent(Contents contents,Integer id) {
        contents.setNid(id);
        contentdao.insertContent(contents);
    }

    @Override
    public void deleteContent(Integer id) {
        contentdao.deleteContent(id);
    }
}