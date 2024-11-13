package com.ceial.milkbackendjava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceial.milkbackendjava.dtos.MilkingDTO;
import com.ceial.milkbackendjava.dtos.MilkingMinDTO;
import com.ceial.milkbackendjava.repositories.MilkingRepository;

@Service
public class MilkingService {
	@Autowired
	private MilkingRepository milkingRepository;
	
	@Transactional(readOnly = true)
	public List<MilkingMinDTO> findAll() {
		var milkings = milkingRepository.findAll();
		return milkings.stream().map(milking -> new MilkingMinDTO(milking)).toList();
	}
	
	@Transactional(readOnly = true)
	public MilkingDTO findById(Long id) {
		var Milking = milkingRepository.findById(id).orElseThrow();
		return new MilkingDTO(Milking);
	}
	
	@Transactional(readOnly = true)
	public List<MilkingMinDTO> findByCowId(Long cowId) {
		var milkings = milkingRepository.findByCowId(cowId);
		return milkings.stream().map(milking -> new MilkingMinDTO(milking)).toList();
	}

	@Transactional
	public MilkingMinDTO update(MilkingMinDTO dto, Long id) {
		var Milking = milkingRepository.findById(id).orElseThrow();
		Milking.setIdentification(dto.getIdentification());
		Milking.setInitialTime(dto.getInitialTime());
		Milking.setFinalTime(dto.getFinalTime());
		Milking.setTotalMilk(dto.getTotalMilk());
		Milking.setOperator(dto.getOperator());
		return new MilkingMinDTO(milkingRepository.save(Milking));
	}


}
