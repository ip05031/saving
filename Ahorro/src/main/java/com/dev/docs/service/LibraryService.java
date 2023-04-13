package com.dev.docs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.docs.model.Library;
import com.dev.docs.model.User;
import com.dev.docs.repository.LibraryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LibraryService {
	
	@Autowired
	LibraryRepository repo;
	
	   public List<Library> listAllLibs() {
	        return repo.findAll();
	   }
	   
	   public void saveLib(Library lib) {
	        repo.save(lib);
	    }

}
