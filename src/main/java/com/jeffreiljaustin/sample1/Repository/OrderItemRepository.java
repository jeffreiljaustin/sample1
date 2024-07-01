package com.jeffreiljaustin.sample1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jeffreiljaustin.sample1.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}