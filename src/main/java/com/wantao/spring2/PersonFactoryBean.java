package com.wantao.spring2;

import org.springframework.beans.factory.FactoryBean;

/*
 *@author:wantao
 *@time:Jul 19, 2018 7:35:08 AM
 *@description:
 */
public class PersonFactoryBean implements FactoryBean<Person> {

	public Person getObject() throws Exception {
        Person person=new Person();
        Car car=new Car();
        car.setName("奔驰");
        person.setName("万涛10");
        person.setAge(20);
        person.setCar(car);
		return person;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Person.class;
	}

}
