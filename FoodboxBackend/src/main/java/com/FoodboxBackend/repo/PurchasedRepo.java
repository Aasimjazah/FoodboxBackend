package com.FoodboxBackend.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.FoodboxBackend.entities.Purchased;

@Repository
public interface PurchasedRepo extends CrudRepository<Purchased, Integer>{

	public List<Purchased> findByUserEmail(String email);
}
