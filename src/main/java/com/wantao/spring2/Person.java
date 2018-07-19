package com.wantao.spring2;

/*
 *@author:wantao
 *@time:Jul 18, 2018 10:15:38 PM
 *@description:
 */
public class Person {
	private String name;
	private Integer age;
	private Car car;

	// init-method
	public void a() {
		System.out.println("进入到init-method");
	}

	// destory-method
	public void b() {
		System.out.println("进入到destory-method");
	}

	public Person() {
		super();
		System.out.println("进入到构造方法");
	}

	public Person(String name, Integer age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}

}
