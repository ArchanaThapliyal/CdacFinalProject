package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Cake;
import com.app.pojos.CartItem;


public interface ICakeDao extends JpaRepository<Cake,Integer>{



	

}
