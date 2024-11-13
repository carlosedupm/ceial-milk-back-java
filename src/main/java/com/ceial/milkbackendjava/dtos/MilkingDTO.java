package com.ceial.milkbackendjava.dtos;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;

import com.ceial.milkbackendjava.entities.Milking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MilkingDTO {

	private Long id;
	private String identification;
	private LocalDateTime initialTime;
	private LocalDateTime finalTime;
	private Double totalMilk;
	private String operator;
	
	public MilkingDTO(Milking entity) {
		BeanUtils.copyProperties(entity, this);
	}
}
