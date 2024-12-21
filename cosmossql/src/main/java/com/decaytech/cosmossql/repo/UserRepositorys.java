package com.decaytech.cosmossql.repo;

import com.azure.cosmos.implementation.User;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.azure.spring.data.cosmos.repository.config.EnableReactiveCosmosRepositories;
import com.decaytech.cosmossql.models.Users;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@EnableReactiveCosmosRepositories
public interface UserRepositorys extends ReactiveCosmosRepository<Users, String> {

    Flux<User> findByFirstName(String firstName);
}