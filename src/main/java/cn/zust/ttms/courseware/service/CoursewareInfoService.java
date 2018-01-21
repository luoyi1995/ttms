package cn.zust.ttms.courseware.service;

import java.util.Map;

public interface CoursewareInfoService {
    Map<String,Object> findTollInfo(int pageCurrent,Integer type,String name);

}
