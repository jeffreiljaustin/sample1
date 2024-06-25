package com.jeffreiljaustin.sample1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffreiljaustin.sample1.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
