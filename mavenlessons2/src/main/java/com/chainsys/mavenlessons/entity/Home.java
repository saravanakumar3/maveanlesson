package com.chainsys.mavenlessons.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.chainsys.mavenlessons.App;

public class Home {
	@Autowired
	@Qualifier("Service")
	NetConnection telecom ;
	Home h = new Home();
	//h.Airtel();
}
