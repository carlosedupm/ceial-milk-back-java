package com.ceial.milkbackendjava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceial.milkbackendjava.dtos.CowDTO;
import com.ceial.milkbackendjava.dtos.CowMinDTO;
import com.ceial.milkbackendjava.dtos.MilkingMinDTO;
import com.ceial.milkbackendjava.services.CowService;
import com.ceial.milkbackendjava.services.MilkingService;

@RestController
@RequestMapping("/api/cows")
public class CowController {

	@Autowired
	private CowService cowService;
	
	@Autowired
	private MilkingService milkingService;
	
	@GetMapping
	public List<CowMinDTO> findAll() {
		return cowService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public CowDTO findById(@PathVariable("id") Long id) {
		return cowService.findById(id);
	}
	
	@GetMapping(path = "/{id}/milkings")
	public List<MilkingMinDTO> findByCowId(@PathVariable("id") Long id) {
		return milkingService.findByCowId(id);
	}
	
	@PutMapping(path = "/{id}")
	public CowMinDTO update(@RequestBody CowMinDTO dto, @PathVariable("id") Long id) {
		return cowService.update(dto, id);
	}
	
}
