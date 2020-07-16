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
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
        return user;
    }
}
