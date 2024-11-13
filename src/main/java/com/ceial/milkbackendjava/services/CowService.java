package com.ceial.milkbackendjava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceial.milkbackendjava.dtos.CowDTO;
import com.ceial.milkbackendjava.dtos.CowMinDTO;
import com.ceial.milkbackendjava.repositories.CowRepository;

@Service
public class CowService {
	@Autowired
	private CowRepository cowRepository;
	
	@Transactional(readOnly = true)
	public List<CowMinDTO> findAll() {
		var cows = cowRepository.findAll();
		return cows.stream().map(cow -> new CowMinDTO(cow)).toList();
	}
	
	@Transactional(readOnly = true)
	public CowDTO findById(Long id) {
		var cow = cowRepository.findById(id).orElseThrow();
		return new CowDTO(cow);
	}

	@Transactional
	public CowMinDTO update(CowMinDTO dto, Long id) {
		var cow = cowRepository.findById(id).orElseThrow();
		cow.setName(dto.getName());
		cow.setBreed(dto.getBreed());
		cow.setLotId(dto.getLotId());
		cow.setHealthStatus(dto.getHealthStatus());
		cow.setUpdatedBy(dto.getUpdatedBy());
		return new CowMinDTO(cowRepository.save(cow));
	}

}
