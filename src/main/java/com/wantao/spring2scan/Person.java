package com.wantao.spring2scan;

import org.springframework.stereotype.Component;

/*
 *@author:wantao
 *@time:Jul 19, 2018 8:06:02 AM
 *@description:
 */
@Component(value="person")//指定id
//使用注解无需指定id属性，使用类首字母小写的类的全名作为id
public class Person {
	public void eat() {
		System.out.println("我在吃饭");
	}

}
