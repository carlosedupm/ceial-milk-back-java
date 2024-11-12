package com.ceial.milkbackendjava.entities;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_cow")
public class Cow {

    // Identification
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id; // Unique identifier for the cow (e.g., tag number or registration code)
    private String identification; // Identification of cow
    private String name; // Name or nickname of the cow
    private int age; // Age of the cow

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

    // Location and management
    private String herd; // Herd or group the cow belongs to
    private String pastureArea; // Pasture area where the cow is allocated

    // Audit information
    @CreationTimestamp
    private LocalDateTime createdAt; // Date and time when the cow was created
    @UpdateTimestamp
    private LocalDateTime updatedAt; // Date and time when the cow was last updated
    @Column(columnDefinition = "TEXT")
    private String createdBy; // User who created the cow
    @Column(columnDefinition = "TEXT")
    private String updatedBy; // User who last updated the cow

}
