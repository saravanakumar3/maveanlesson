package com.chainsys.mavenlessons;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.chainsys.mavenlessons.entity.Airtel;
import com.chainsys.mavenlessons.entity.NetConnection;
import com.chainsys.mavenlessons.entity.PojoClass;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	
    public static void main( String[] args )
    {
		/*
		 * ConfigurableApplicationContext context =SpringApplication.run(App.class,
		 * args); PojoClass h= context.getBean(PojoClass.class); h. connection() ;
		 * PojoClass h2= context.getBean(PojoClass.class); h2. connection() ;
		 */
		/*
		 * NetConnection telecom =new Airtel(); telecom.servce();
		 */
    	SpringApplication.run(App.class,args);	
    }
}
