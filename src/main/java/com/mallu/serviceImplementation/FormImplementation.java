package com.mallu.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mallu.entity.Form;
import com.mallu.repository.FormRepo;
import com.mallu.serviceInterface.FormService;

@Service
public class FormImplementation implements FormService {
	@Autowired
	FormRepo repo;

	@Override
	public int save(Form form) {
		return repo.save(form).getId();
	}

}
