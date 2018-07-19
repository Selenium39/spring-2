package com.wantao.spring2;

/*
 *@author:wantao
 *@time:Jul 19, 2018 12:37:02 AM
 *@description:
 */
public class PersonFactory {
	// 静态工厂方法
	public static Person createPerson(String name, Integer age, Car car) {

		return new Person(name, age, car);
	}

	// 非静态工厂方法
	public Person createPerson1(String name, Integer age, Car car) {
		return new Person(name, age, car);
	}

}
