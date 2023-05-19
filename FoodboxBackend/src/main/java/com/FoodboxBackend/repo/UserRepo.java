package com.FoodboxBackend.repo;

import org.springframework.data.repository.CrudRepository;

import com.FoodboxBackend.entities.User;


public interface UserRepo extends CrudRepository<User, String> 
{
     public User findByEmail(String email);
}
