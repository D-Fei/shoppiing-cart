package com.train.dao;

import com.train.beans.Details;
import com.train.common.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
     * 根据hashmap增加表单中所有明细
     */
    public void addDetails(HashMap hashMap,int detailId) {
        int result = 0;
        List<Details> details = (List<Details>) hashMap.get(detailId);
        for (Details details1 : details) {
            addDetail(details1);
        }
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
     * 根据detailId删除数据
     * @param id---穿过来的不是detailId
     */
    public void deleteDetails(int id) {
        Details details = null;
        details = getDetail(id);
        SqlSession sqlSession = MybatisUtil.getConn();
        sqlSession.delete("deleteDetails", details.getDetailId());
        sqlSession.commit();
        sqlSession.close();
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
     * 联动form修改而修改
     */
    public void updateDetails(int detailId,HashMap map) {
        ArrayList<Details> details = (ArrayList<Details>) map.get(detailId);
        for (Details detaail : details) {
            updateDetail(detaail);
        }
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
    public ArrayList<Details> getAllDetails(int detailId) {
        List<Details> details = null;
        SqlSession sqlSession = MybatisUtil.getConn();
        details = sqlSession.selectList("getAllDetails", detailId);
        ArrayList<Details> details1 = new ArrayList<Details>();
        details1.addAll(details);
        sqlSession.commit();
        sqlSession.close();
        return details1;
    }
}
