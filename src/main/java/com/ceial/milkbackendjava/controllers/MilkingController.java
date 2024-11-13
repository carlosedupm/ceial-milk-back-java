package com.ceial.milkbackendjava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceial.milkbackendjava.dtos.MilkingDTO;
import com.ceial.milkbackendjava.dtos.MilkingMinDTO;
import com.ceial.milkbackendjava.services.MilkingService;

@RestController
@RequestMapping("/api/milkings")
public class MilkingController {

	@Autowired
	private MilkingService milkingService;
	
	@GetMapping
	public List<MilkingMinDTO> findAll() {
		return milkingService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public MilkingDTO findById(@PathVariable("id") Long id) {
		return milkingService.findById(id);
	}
	
	@PutMapping(path = "/{id}")
	public MilkingMinDTO update(@RequestBody MilkingMinDTO dto, @PathVariable("id") Long id) {
		return milkingService.update(dto, id);
	}
	
}
