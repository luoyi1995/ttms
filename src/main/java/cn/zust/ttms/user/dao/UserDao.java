package cn.zust.ttms.user.dao;


import cn.zust.ttms.user.entity.User;

public interface UserDao {

    User findByUserId(String userId);


}
