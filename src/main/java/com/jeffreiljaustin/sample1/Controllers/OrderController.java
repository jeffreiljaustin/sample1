package com.jeffreiljaustin.sample1.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jeffreiljaustin.sample1.Model.Order;
import com.jeffreiljaustin.sample1.NotFoundException.OrderNotFoundException;
import com.jeffreiljaustin.sample1.Repository.OrderRepository;

@RestController
public class OrderController {

    private final OrderRepository repo;

    // Constructor
    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    // http://127.0.0.1:8080/orders
    // Get all Orders
    @GetMapping("/orders")
    public List<Order> getOrders() {
        return repo.findAll();
    }

    // http://127.0.0.1:8080/order/52
    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable Long id) {
        return repo.findById(id)
            .orElseThrow(() -> new OrderNotFoundException(id));
    }

    // http://127.0.0.1:8080/order/new
    @PostMapping("/order/new")
    public String addOrder(@RequestBody Order newOrder) {
        repo.save(newOrder);
        return "A new order is added. Yey!";
    }

    // delete endpoints
    // http://127.0.0.1:8080/order/delete/1
    @DeleteMapping("/order/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        repo.deleteById(id);
        return "An order is deleted!";
    }
}
