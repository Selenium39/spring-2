package com.wantao.spring2;
/*
 *@author:wantao
 *@time:Jul 18, 2018 10:16:14 PM
 *@description:
 */
public class Car {
     private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	
}
