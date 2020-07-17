package com.train.dao;


import com.train.beans.Form;
import com.train.common.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class FormDao {
    /**
     * 增加
     */
    public int addForm(Form form) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.insert("addForm", form);
        DetailsDao detailsDao = new DetailsDao();
        detailsDao.addDetails(form.getDetail(),form.getDetailId()); //利用detailsDao添加form中hashmap类型的明细数据
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     * 删除
     */
    public int deleteForm(int id) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.delete("deleteForm", id);
        DetailsDao detailsDao = new DetailsDao();
        detailsDao.deleteDetails(id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     * 修改
     */
    public int updateForm(Form form) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.update("updateForm", form);
        DetailsDao detailsDao = new DetailsDao();
        detailsDao.updateDetails(form.getDetailId(), form.getDetail());
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     * 查询
     */
    public Form getForm(int id) {
        Form form = null;
        SqlSession sqlSession = MybatisUtil.getConn();
        form = sqlSession.selectOne("getForm", id);
        DetailsDao detailsDao = new DetailsDao();
        HashMap<Integer, List> hashMap = new HashMap();
        hashMap.put(form.getDetailId(), detailsDao.getAllDetails(form.getDetailId()));
        form.setDetail(hashMap);
        sqlSession.commit();
        sqlSession.close();
        return form;
    }
}
