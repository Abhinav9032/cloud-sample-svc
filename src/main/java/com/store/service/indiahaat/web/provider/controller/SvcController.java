package com.store.service.indiahaat.web.provider.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SvcController {
	
	@CrossOrigin("*")
	@GetMapping("/yes")
	public String getResponse() {
		return "Hey its me"+LocalDateTime.now();
	}

}
