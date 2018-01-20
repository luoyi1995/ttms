package cn.zust.ttms.user.service.serviceImpl;

import cn.zust.ttms.common.exception.ServiceException;
import cn.zust.ttms.user.dao.UserDao;
import cn.zust.ttms.user.entity.User;
import cn.zust.ttms.user.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    private UserDao userDao;

    public String findByUserId(String userId,String pwd) {
        if(userId==null||userId==""){
            throw new ServiceException("输入的账号不合法");
        }
        if(pwd==null||pwd==""){
            throw new ServiceException("输入的密码不合法");
        }
        User user=userDao.findByUserId(userId);
        if(user!=null){
            String password=user.getPassword();
            if(pwd.equals(password)){
                return "登陆成功";
            }
        }
        throw new ServiceException("输入的账号或者密码不正确");
    }
}
