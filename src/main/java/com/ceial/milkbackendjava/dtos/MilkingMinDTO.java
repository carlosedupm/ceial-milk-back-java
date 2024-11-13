package com.ceial.milkbackendjava.dtos;

import java.time.LocalDateTime;

import com.ceial.milkbackendjava.entities.Milking;
import com.ceial.milkbackendjava.projections.MilkingProjection;

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
	private Double milkingQuantity;
	
	public MilkingMinDTO(Milking milking) {
		this.identification = milking.getIdentification();
		this.initialTime = milking.getInitialTime();
		this.finalTime = milking.getFinalTime();
		this.totalMilk = milking.getTotalMilk();
		this.operator = milking.getOperator();
	}
	
	public MilkingMinDTO(MilkingProjection projection) {
		this.identification = projection.getIdentification();
		this.initialTime = projection.getInitialTime();
		this.finalTime = projection.getFinalTime();
		this.totalMilk = projection.getTotalMilk();
		this.operator = projection.getOperator();
		this.milkingQuantity =  projection.getMilkQuantity();
	}
}
