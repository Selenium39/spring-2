package com.wantao.spring2scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@author:wantao
 *@time:Jul 19, 2018 8:06:35 AM
 *@description:
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springscan.xml");
		Person person1 = (Person) ac.getBean("person");
		person1.eat();
	}

}
