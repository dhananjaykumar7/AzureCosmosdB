package com.decaytech.cosmossql;


import com.azure.spring.data.cosmos.repository.config.EnableReactiveCosmosRepositories;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableReactiveCosmosRepositories(basePackages = "com.decaytech.cosmossql")
public class CosmossqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmossqlApplication.class, args);
	}

}




