package com.train.dao;

import com.train.beans.User;
import com.train.common.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UserDao {
    /**
     * 通过ID查询
     */
    public User getUser(int id) {
        User user = null;
        SqlSession sqlSession = MybatisUtil.getConn();
        user = sqlSession.selectOne("getUserById", id);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }

    /**
     * 增加
     */
    public int addUser(User user) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.insert("insertUser", user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     * 根据id删除
     */
    public int deleteUser(int id) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.delete("deleteUser", id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    /**
     * 根据id修改user
     */
    public int updateUser(User user) {
        int result = 0;
        SqlSession sqlSession = MybatisUtil.getConn();
        result = sqlSession.update("updateUset", user);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
