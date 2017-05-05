package com.example.namespacehandler;

import com.example.beandefinitionparser.Component1DefinitionParser;
import com.example.beandefinitionparser.Component2DefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

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
public class EsbNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("componment1", new Component1DefinitionParser());
        registerBeanDefinitionParser("componment2", new Component2DefinitionParser());
    }
}