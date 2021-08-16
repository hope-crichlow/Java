package com.hope.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hope.languages.models.Language;
import com.hope.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
//	private final LanguageRepository langRepo;
//	
//	public LanguageService(LanguageRepository langRepo) {
//		this.langRepo = langRepo;
//	}
	
	@Autowired
	private LanguageRepository langRepo;
	
	// CREATE & UPDATE LANGUAGE
	public Language saveLang(Language lang) {
		return langRepo.save(lang);
	}
	
	// FIND ALL LANGUAGES
	public List<Language> allLangs(){
		return langRepo.findAll();
	}
	
	// FIND ONE LANGUAGE
	public Language findOneLang(Long id) {
		return langRepo.findById(id).orElse(null);
	}
	
	// DELETE ONE LANGUAGE
	public void deleteLang(Long id) {
		langRepo.deleteById(id);
	}
	
}
