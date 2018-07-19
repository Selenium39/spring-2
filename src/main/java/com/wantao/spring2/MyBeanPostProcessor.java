package com.wantao.spring2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
 *@author:wantao
 *@time:Jul 19, 2018 12:15:21 AM
 *@description:
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//后置处理器的前置处理
		System.out.println("进入到后置处理器的前置处理");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//后置处理器的后置处理
		System.out.println("进入到后置处理器的后置处理");
		return bean;
	}

}
