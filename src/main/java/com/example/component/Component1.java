package com.example.component;

import com.example.entity.People;
import org.springframework.context.SmartLifecycle;

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
public class Component1 extends BaseComponment implements SmartLifecycle{
    public void query(People people) {
        System.out.println("我是" + people.getName() + "今年" + people.getAge() + "岁了,今天买了辆车");
        people.setAge(people.getAge() + 1);
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable runnable) {

    }

    @Override
    public void start() {
        People people = new People();
        people.setAge(1);
        people.setName("2");
        this.query(people);
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}