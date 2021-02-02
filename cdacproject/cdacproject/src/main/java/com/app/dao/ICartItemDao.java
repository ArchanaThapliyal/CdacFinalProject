package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Cake;
import com.app.pojos.CartItem;
import com.app.pojos.Customer;


public interface ICartItemDao extends JpaRepository<CartItem,Integer> {
        public List<CartItem> findByCustomer(Customer customer);
        public CartItem findByCustomerAndCake(Customer customer,Cake cake);
}