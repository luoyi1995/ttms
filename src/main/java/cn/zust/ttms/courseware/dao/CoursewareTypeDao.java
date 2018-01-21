package cn.zust.ttms.courseware.dao;

import cn.zust.ttms.courseware.entity.CoursewareType;

import java.util.List;

public interface CoursewareTypeDao {
    List<CoursewareType> findTotalType();
}
