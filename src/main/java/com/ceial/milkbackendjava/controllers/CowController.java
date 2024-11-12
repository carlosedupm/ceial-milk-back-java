package com.ceial.milkbackendjava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceial.milkbackendjava.dtos.CowMinDTO;
import com.ceial.milkbackendjava.services.CowService;

@RestController
@RequestMapping("/api/cows")
public class CowController {

	@Autowired
	private CowService cowService;
	
	@GetMapping
	public List<CowMinDTO> findAll() {
		return cowService.findAll();
	}
	
	@PutMapping(path = "/{id}")
	public CowMinDTO update(@RequestBody CowMinDTO dto, @PathVariable("id") Long id) {
		return cowService.update(dto, id);
	}
	
}
