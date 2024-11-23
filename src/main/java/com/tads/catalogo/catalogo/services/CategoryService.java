package com.tads.catalogo.catalogo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tads.catalogo.catalogo.entities.Category;
import com.tads.catalogo.catalogo.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
public List<Category> findAll(){
		
		
		return repository.findAll();
		
	}
	
}
