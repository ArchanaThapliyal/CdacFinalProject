package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.CakeNotFoundException;
import com.app.dao.ICakeDao;
import com.app.pojos.Cake;


@Service
@Transactional
public class CakeServiceImpl implements ICakeService {

	@Autowired
	private ICakeDao dao;

	@Override
	public List<Cake> getAllCakes() {
		System.out.println("dao imple class " + dao.getClass().getName());
		return dao.findAll();
	}
	@Override
	public Cake addCakeDetails(Cake c) {
		return dao.save(c);
	}

	@Override
	public Cake updateCakeDetails(Cake c) {
		Optional<Cake> optional = dao.findById(c.getCakeId());
		if (optional.isPresent())
			return dao.save(c); // update
		throw new CakeNotFoundException("Cake Not Found : Invalid Cake id " + c.getCakeId());

	}
	@Override
	public void deleteCakeDetails(int cakeId){
		Optional<Cake> optional = dao.findById(cakeId);
		if (optional.isPresent())
			dao.deleteById(cakeId);
		else
			throw new CakeNotFoundException("Cake Not Found : Invalid Cake id " + cakeId);
	}

}
