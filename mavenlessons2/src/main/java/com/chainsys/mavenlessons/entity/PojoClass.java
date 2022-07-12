package com.chainsys.mavenlessons.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class PojoClass {
	 PojoClass (){
	System.out.println("let see");	
	 } 
private int id;
private  String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void connection() {
	System.out.println("psk connected successfully");
}
}
