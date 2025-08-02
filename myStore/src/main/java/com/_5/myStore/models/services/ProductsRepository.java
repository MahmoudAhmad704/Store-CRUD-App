package com._5.myStore.models.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com._5.myStore.models.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
