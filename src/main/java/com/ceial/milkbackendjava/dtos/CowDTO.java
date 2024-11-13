package com.ceial.milkbackendjava.dtos;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.ceial.milkbackendjava.entities.Cow;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CowDTO {
	
	private Long id; // Unique identifier for the cow (e.g., tag number or registration code)
    private String identification; // Identification of cow
    private String name; // Name or nickname of the cow
    private int age; // Age of the cow
    
    // Lot Identification
    private Integer lotId; //Identification lot

    // Physical characteristics
    private double weight; // Current weight of the cow
    private double height; // Height of the cow
    private String breed; // Breed of the cow

    // Milk production
    private double dailyMilkProduction; // Daily milk production (in liters)
    private double averageMonthlyProduction; // Average monthly milk production (in liters)

    // Reproductive information
    private int numberOfBirths; // Number of births
    private Date lastCalvingDate; // Date of last calving
    private boolean inLactation; // Whether the cow is currently lactating

    // Health and monitoring
    private double bodyTemperature; // Body temperature for health monitoring
    private String healthStatus; // General health status

    // Audit information
    private LocalDateTime createdAt; // Date and time when the cow was created
    private LocalDateTime updatedAt; // Date and time when the cow was last updated
    private String createdBy; // User who created the cow
    private String updatedBy; // User who last updated the cow
    
	public CowDTO(Cow entity) {
		BeanUtils.copyProperties(entity, this);
	}
	

}
