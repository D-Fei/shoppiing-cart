package com.train.dao;


import com.train.beans.Form;
import com.train.common.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class FormDao {
    /**
     * 增加
     */
    public int addForm(Form form) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.insert("addForm", form);
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
        sqlSession.commit();
        sqlSession.close();
        return form;
    }
}
