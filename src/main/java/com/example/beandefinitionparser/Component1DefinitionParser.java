package com.example.beandefinitionparser;

import com.example.component.Component1;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

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
public class Component1DefinitionParser extends AbstractSingleBeanDefinitionParser {
    protected Class getBeanClass(Element element) {
        return Component1.class;
    }

    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String inputId = element.getAttribute("inputId");
        String outputId = element.getAttribute("outputId");

        if (StringUtils.hasText(inputId)) {
            bean.addPropertyValue("inputId", inputId);
        }
        if (StringUtils.hasText(outputId)) {
            bean.addPropertyValue("outputId", outputId);
        }
    }
}