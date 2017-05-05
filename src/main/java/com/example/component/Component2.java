package com.example.component;

import com.example.entity.People;
import org.springframework.beans.factory.InitializingBean;

/**
 * <p>
 * Title :
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Author :tyz 2017/5/5
 * </p>
 * <p>
 * Department : 研发部
 * </p>
 * Copyright : ©2014-2014 江苏汇鑫融智软件科技有限公司
 * </p>
 */
public class Component2 extends BaseComponment implements InitializingBean {
    public void query(People people) {
        System.out.println("我是" + people.getName() + "今年" + people.getAge() + "岁了，今天开开车出去玩了");
        people.setAge(people.getAge() + 1);
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}