package com.qfedu.dao;

import com.qfedu.pojo.Contents;

import java.util.List;

/**
 * Created by Administrator on 2019/6/12.
 */
public interface ContentDao {
    List<Contents> selectContent(Integer id);

    void insertContent(Contents contents);

    void deleteContent(Integer id);
}
