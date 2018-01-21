package cn.zust.ttms.courseware.service.impl;

import cn.zust.ttms.common.entities.PageObject;
import cn.zust.ttms.courseware.dao.CoursewareInfoDao;
import cn.zust.ttms.courseware.dao.CoursewareTypeDao;
import cn.zust.ttms.courseware.entity.CoursewareType;
import cn.zust.ttms.courseware.service.CoursewareInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CoursewareInfoServiceImpl implements CoursewareInfoService {

    @Resource
    private CoursewareInfoDao coursewareInfoDao;

    @Resource
    private CoursewareTypeDao coursewareTypeDao;




    public Map<String,Object> findTollInfo(int pageCurrent,Integer type,String name) {
        int pageSize=3;
        int startIndex=(pageCurrent-1)*pageSize;
        double infoNum=coursewareInfoDao.countInfoNum(type,name);
        int pageCount= (int) (Math.ceil(infoNum/pageSize));
        List<Map<String,Object>> coursewareInfos=coursewareInfoDao.findTollInfo(pageSize,startIndex,type,name);

        Map<String,Object> map=new HashMap<String,Object>();

        //将分页信息分装到pageObjet中
        PageObject pageObject=new PageObject();
        pageObject.setPageSize(pageSize);
        pageObject.setStartIndex(startIndex);
        pageObject.setInfoNum((int) infoNum);
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageCount(pageCount);

        //查询出所有课件类别
        List<CoursewareType> coursewareTypeList=coursewareTypeDao.findTotalType();

        map.put("pageObject",pageObject);
        map.put("coursewareInfos",coursewareInfos);
        map.put("coursewareTypeList",coursewareTypeList);
        return map;
    }
}
