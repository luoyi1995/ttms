package cn.zust.ttms.courseware.controller;


import cn.zust.ttms.common.entities.JsonResult;
import cn.zust.ttms.courseware.service.CoursewareInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/coursewareInfo/")
public class CoursewareInfoController {

    @Autowired
    private CoursewareInfoService coursewareInfoService;


    @RequestMapping(value = "listUI")
    public String listUI(){
        return "courseware/courseware_list";
    }


    @ResponseBody
    @RequestMapping(value = "getTollInfo.do", method = RequestMethod.POST)
    public JsonResult getTollInfo(int pageCurrent,Integer type,String name) {
        Map<String,Object> result=new HashMap<String,Object>();
        try {
             result = coursewareInfoService.findTollInfo(pageCurrent,type,name);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult(e.getMessage());
        }
        return new JsonResult(result);
    }
}
