package com.decaytech.cosmossql.service;

import com.decaytech.cosmossql.models.Users;
import com.decaytech.cosmossql.repo.UserRepositorys;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class DataLoader{
	private static final Logger log = LoggerFactory.getLogger(DataLoader.class);
	private final UserRepositorys repo;

    DataLoader(UserRepositorys repo) {
        this.repo = repo;
    }

    @PostConstruct
	void loadData(){
		repo.deleteAll()
				.thenMany(Flux.just(new Users("testId","Alpha","Bravo"," M002, Hamilton Home"),
						new Users("testId2","Dhananjay","Kumar"," M002, Hamilton Home")))
						.flatMap(repo::save)
						.thenMany(repo.findAll()).subscribe(user -> log.info(user.toString()));
	}
}