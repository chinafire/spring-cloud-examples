package com.jja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZullExpApp {
	public static void main(String[] args) {
		SpringApplication.run(ZullExpApp.class, args);
		
	}
}
