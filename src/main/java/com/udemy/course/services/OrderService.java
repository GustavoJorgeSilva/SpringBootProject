package com.udemy.course.services;

import com.udemy.course.entities.Order;
import com.udemy.course.entities.User;
import com.udemy.course.repository.OrderRepository;
import com.udemy.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> obj = repository.findById(id);
       return obj.get();
    }

}
