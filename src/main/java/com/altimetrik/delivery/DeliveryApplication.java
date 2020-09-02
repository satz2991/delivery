package com.altimetrik.delivery;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DeliveryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DeliveryApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
        
        Arrays.sort(beanNames);
         
        for (String beanName : beanNames) 
        {
            System.out.println(beanName);
        }
	}

}
