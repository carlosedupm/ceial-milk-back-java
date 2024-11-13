package com.ceial.milkbackendjava.dtos;

import java.time.LocalDateTime;

import com.ceial.milkbackendjava.entities.Milking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MilkingMinDTO {

	
	private String identification;
	private LocalDateTime initialTime;
	private LocalDateTime finalTime;
	private Double totalMilk;
	private String operator;
	
	public MilkingMinDTO(Milking milking) {
		this.identification = milking.getIdentification();
		this.initialTime = milking.getInitialTime();
		this.finalTime = milking.getFinalTime();
		this.totalMilk = milking.getTotalMilk();
		this.operator = milking.getOperator();
	}
}
