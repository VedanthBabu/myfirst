package com.example.userservice.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="userdetails")
public interface UserRestRepository extends JpaRepository<UserDetailsEntity, Integer>{

}
