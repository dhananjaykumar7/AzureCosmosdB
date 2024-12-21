package com.decaytech.cosmossql.controller;

import com.decaytech.cosmossql.models.Users;

import com.decaytech.cosmossql.repo.UserRepositorys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController

public class CosmoSqlController{
	private final UserRepositorys repo;

    CosmoSqlController(UserRepositorys repo) {
        this.repo = repo;

    }
	@GetMapping
	Flux<Users> getAllUsers(){
		return repo.findAll();
	}
}