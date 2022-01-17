package com.unmsm.notaria.service;

import java.util.List;

public interface GeneralService <T> {
	
	public T save(T object);
	
	public T findOneById(Long id);
	
	public List<T> findAll();
	
	public void delete(Long id);
	
}
