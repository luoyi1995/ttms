package cn.zust.ttms.courseware.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CoursewareInfoDao {
    List<Map<String,Object>> findTollInfo(@Param("pageSize") int pageSize,
                                          @Param("startIndex") int startIndex,
                                          @Param("type") Integer type,
                                          @Param("name") String name);

    long countInfoNum(@Param("type") Integer type,
                      @Param("name") String name);
}
