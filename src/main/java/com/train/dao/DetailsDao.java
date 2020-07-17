package com.train.dao;

import com.train.beans.Details;
import com.train.common.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class DetailsDao {
    /**
     * 增加
     */
    public int addDetail(Details details) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.insert("addDetail", details);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     * 根据id删除
     */
    public int deleteDetail(int id) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.delete("deleteDetail", id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     * 根据id修改
     */
    public int updateDetail(Details details) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.update("updateDetail", details);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     * 根据id查询一条数据
     */
    public Details getDetail(int id) {
        Details details = null;
        SqlSession sqlSession = MybatisUtil.getConn();
        details = sqlSession.selectOne("getDetail", id);
        sqlSession.commit();
        sqlSession.close();
        return details;
    }
    /**
     * 根据detailId查询，返回所有detailId相同的数据，返回一个list
     */

}
