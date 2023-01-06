package com.caiopivetta6.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.Services.exceptions.ObjectNotFoundException;
import com.caiopivetta6.domain.Category;
import com.caiopivetta6.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category find(Integer id) {
		
		Optional<Category> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Category.class.getName()));

	}
}
