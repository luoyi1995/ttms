package cn.zust.ttms.user.controller;

import cn.zust.ttms.common.entities.JsonResult;
import cn.zust.ttms.common.exception.ServiceException;
import cn.zust.ttms.user.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 角色管理模块
 *
 */
@Controller
@RequestMapping("/role")
public class UserManagementController {


    @Autowired
    private UserManagementService userManagementService;


    @ResponseBody
    @RequestMapping("user/login.do")
    public JsonResult dologin(String userId,String pwd){
        String successMessage=null;
        try {
            successMessage=userManagementService.findByUserId(userId,pwd);
        }catch (ServiceException e){
            return new JsonResult(e);
        }
        return new JsonResult(successMessage);
    }
}
