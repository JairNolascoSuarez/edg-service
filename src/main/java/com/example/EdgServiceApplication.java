package com.example;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


import com.example.filters.SimplePostFilter;

import com.example.filters.SimplePreFilter;

@EnableZuulProxy
@SpringBootApplication
public class EdgServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgServiceApplication.class, args);
	}
	

	@Bean

	public SimplePreFilter simplePreFilter() {

		return new SimplePreFilter();

	}

	

	@Bean

	public SimplePostFilter simplePostFilter() {

		return new SimplePostFilter();

	}

}
