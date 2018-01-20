package cn.zust.ttms.courseware.service.impl;

import cn.zust.ttms.courseware.dao.CoursewareInfoDao;
import cn.zust.ttms.courseware.entity.CoursewareInfo;
import cn.zust.ttms.courseware.service.CoursewareInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursewareInfoServiceImpl implements CoursewareInfoService {

    @Autowired
    private CoursewareInfoDao coursewareInfoDao;


    public List<CoursewareInfo> findTollInfo(int pageCurrent) {
        int pageSize=3;
        int startIndex=(pageCurrent-1)*pageSize;
        List<CoursewareInfo> coursewareInfos=coursewareInfoDao.findTollInfo(pageSize,startIndex);
        return coursewareInfos;
    }
}
