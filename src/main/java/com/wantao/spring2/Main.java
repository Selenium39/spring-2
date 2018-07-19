package com.wantao.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) { // 1.获取ApplicationContext容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		// 2.通过容器获取Bean
		Car car1 = (Car) ac.getBean("car1");
		System.out.println(car1);
		Person person1 = (Person) ac.getBean("person1");
		System.out.println(person1);
		Person person2 = (Person) ac.getBean("person2");
		System.out.println(person2);
		Person person3 = (Person) ac.getBean("person3");
		System.out.println(person3);
		Person person4 = (Person) ac.getBean("person4");
		System.out.println(person4);
		Person person5 = (Person) ac.getBean("person5");
		System.out.println(person5);
		Person person6 = (Person) ac.getBean("person6");
		System.out.println(person6);
		Person person7 = (Person) ac.getBean("person7");
		System.out.println(person7);
		Person person8 = (Person) ac.getBean("personFactory");
		System.out.println(person8);
		Person person9 = (Person) ac.getBean("person9");
		System.out.println(person9);
		Person person10 = (Person) ac.getBean("person10");
		System.out.println(person10);
	}
}
