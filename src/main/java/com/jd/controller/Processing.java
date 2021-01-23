package com.jd.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Processing {

	@PostConstruct
	void display() {
		System.out.println("in post construct");
	}
	
	@PreDestroy
	void display1() {
		System.out.println("in pre destroy");
	}
}
