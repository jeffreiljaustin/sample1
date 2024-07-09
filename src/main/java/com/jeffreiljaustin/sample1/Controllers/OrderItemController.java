package com.jeffreiljaustin.sample1.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffreiljaustin.sample1.Model.OrderItem;
import com.jeffreiljaustin.sample1.NotFoundException.OrderItemNotFoundException;
import com.jeffreiljaustin.sample1.Repository.OrderItemRepository;

@RestController
@RequestMapping("api/v1/OrderItem")
public class OrderItemController {

    private final OrderItemRepository repo;

    // Constructor
    public OrderItemController(OrderItemRepository repo) {
        this.repo = repo;
    }

    // http://127.0.0.1:8080/orderItems
    // Get all OrderItems
    @GetMapping("/all")
    public List<OrderItem> getOrderItems() {
        return repo.findAll();
    }

    // http://127.0.0.1:8080/orderItem/52
    @GetMapping("/{id}")
    public OrderItem getOrderItem(@PathVariable Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new OrderItemNotFoundException(id));
    }

    // http://127.0.0.1:8080/orderItem/new
    @PostMapping("/new")
    public String addOrderItem(@RequestBody OrderItem newOrderItem) {
        repo.save(newOrderItem);
        return "A new order item is added. Yey!";
    }

    // delete endpoints
    // http://127.0.0.1:8080/orderItem/delete/1
    @DeleteMapping("/delete/{id}")
    public String deleteOrderItem(@PathVariable Long id) {
        repo.deleteById(id);
        return "An order item is deleted!";
    }
}
