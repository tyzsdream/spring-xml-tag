package com.example;

import com.example.component.BaseComponment;
import com.example.entity.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * Title :
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Author :tyz 2017/5/3
 * </p>
 * <p>
 * Department : 研发部
 * </p>
 * Copyright : ©2014-2014 江苏汇鑫融智软件科技有限公司
 * </p>
 */
public class AAA {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/service.xml");
        People people = new People();
        people.setName("测试人");
        people.setAge(20);
//        for (String aa : ctx.getBeanDefinitionNames()) {
//            System.out.print(aa + ":");
//            ((BaseComponment) ctx.getBean(aa)).query(people);
//        }
    }
}
