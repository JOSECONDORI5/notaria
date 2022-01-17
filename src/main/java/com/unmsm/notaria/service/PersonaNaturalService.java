package com.unmsm.notaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.unmsm.notaria.model.PersonaNatural;
import com.unmsm.notaria.repository.IPersonaNaturalRepository;

@Controller
public class PersonaNaturalService implements GeneralService<PersonaNatural> {
	
	@Autowired
	IPersonaNaturalRepository repo;

	@Override
	public PersonaNatural save(PersonaNatural object) {
			return repo.save(object);
	}

	@Override
	public PersonaNatural findOneById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<PersonaNatural> findAll() {
		return repo.findAll();
	}


	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}	

}
