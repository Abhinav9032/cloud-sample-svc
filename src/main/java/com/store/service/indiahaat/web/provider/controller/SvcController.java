package com.store.service.indiahaat.web.provider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SvcController {
	
	@Autowired
	private Repo repo;
	
	@CrossOrigin("*")
	@GetMapping("/yes")
	public String getResponse() {
		System.out.println(repo.findAll());
		return "Hey its me popo again -  " + repo.findAll();
	}

}
