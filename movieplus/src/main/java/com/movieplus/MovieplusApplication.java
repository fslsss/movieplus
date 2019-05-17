package com.movieplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.movieplus.dao")
public class MovieplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieplusApplication.class, args);
	}

}
