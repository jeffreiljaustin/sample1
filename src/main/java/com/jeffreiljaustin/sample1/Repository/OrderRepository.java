package com.jeffreiljaustin.sample1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffreiljaustin.sample1.Model.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
