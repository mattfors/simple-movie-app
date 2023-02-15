package com.fors.simplemovieapi.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Person {
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public String toString() {
	     return ReflectionToStringBuilder.toString(this);
	 }

}
