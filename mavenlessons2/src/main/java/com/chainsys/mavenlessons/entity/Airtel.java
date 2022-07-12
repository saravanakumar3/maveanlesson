package com.chainsys.mavenlessons.entity;

import org.springframework.stereotype.Component;

@Component("Service")
public class Airtel implements NetConnection
{
	 public void servce() {
		 System.out.println("Airtel is lead services provider in india");
	 }
	 }
