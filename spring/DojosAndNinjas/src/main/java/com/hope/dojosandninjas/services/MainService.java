package com.hope.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hope.dojosandninjas.models.Dojo;
import com.hope.dojosandninjas.models.Ninja;
import com.hope.dojosandninjas.repositories.DojoRepository;
import com.hope.dojosandninjas.repositories.NinjaRepository;

@Service
public class MainService {

	
	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	
// - - - - - - - - - - - - - - - - DOJO CRUD - - - - - - - - - - - - - - - - //
	
	// CREATE DOJO
	public Dojo saveDojo(Dojo d) {
		return dojoRepo.save(d);
	}
	
	// FIND ALL DOJOS
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	// FIND ONE DOJO
	public Dojo findOneDojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	
	// DELETE ONE DOJO

// - - - - - - - - - - - - - - - - DOJO CRUD - - - - - - - - - - - - - - - - //
	
	
	
// - - - - - - - - - - - - - - - - NINJA CRUD - - - - - - - - - - - - - - - - //
	
	// CREATE NINJA
	public Ninja saveNinja(Ninja n) {
		return ninjaRepo.save(n);
	}
	
	// FIND ALL NINJAS
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	// FIND ONE NINJA
	// DELETE ONE NINJA
// - - - - - - - - - - - - - - - - NINJA CRUD - - - - - - - - - - - - - - - - //
}
