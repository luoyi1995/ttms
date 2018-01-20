package cn.zust.ttms.courseware.service;

import cn.zust.ttms.courseware.entity.CoursewareInfo;

import java.util.List;

public interface CoursewareInfoService {
    List<CoursewareInfo> findTollInfo(int pageCurrent);
}
