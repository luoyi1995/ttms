package cn.zust.ttms.courseware.dao;

import cn.zust.ttms.courseware.entity.CoursewareInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursewareInfoDao {
    List<CoursewareInfo> findTollInfo(@Param("pageSize") int pageSize,
                                      @Param("startIndex") int startIndex);
}
