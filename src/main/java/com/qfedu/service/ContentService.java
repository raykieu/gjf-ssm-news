package com.qfedu.service;

import com.qfedu.pojo.Contents;

import java.util.List;

/**
 * Created by Administrator on 2019/6/12.
 */
public interface ContentService {

    List<Contents> selectContent(Integer id);

    void insertContent(Contents contents,Integer id);

    void deleteContent(Integer id);
}
