package cn.zust.ttms.role.test;

import cn.zust.ttms.user.service.UserManagementService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleManagementServiceImplTest {

    ClassPathXmlApplicationContext ctx;
    @Before
    public void init(){
        ctx=new ClassPathXmlApplicationContext("spring-pool.xml","spring-mybatis.xml","spring-mvc.xml");
    }


    @Test
    public void testFindByUserId(){
        UserManagementService roleManagementService=ctx.getBean("userManagementServiceImpl",UserManagementService.class);
        String message=roleManagementService.findByUserId("1141010087","12345");
        System.out.println(message);

    }
}