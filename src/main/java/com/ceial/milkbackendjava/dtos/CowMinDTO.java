package com.ceial.milkbackendjava.dtos;

import com.ceial.milkbackendjava.entities.Cow;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CowMinDTO {
	private Long id;
	private String identification;
	private String name;
	private String breed;
	private Integer lotId;
	private String healthStatus;
	private String createdBy;
	private String updatedBy;
	
	public CowMinDTO(Cow cow) {
		this.id = cow.getId();
		this.name = cow.getName();
		this.breed = cow.getBreed();
		this.lotId = cow.getLotId();
		this.identification = cow.getIdentification();
		this.healthStatus = cow.getHealthStatus();
		this.createdBy = cow.getCreatedBy();
		this.updatedBy = cow.getUpdatedBy();
	}
	

}
