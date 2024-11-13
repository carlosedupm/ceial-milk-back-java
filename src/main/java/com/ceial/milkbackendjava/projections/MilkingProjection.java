package com.ceial.milkbackendjava.projections;

import java.time.LocalDateTime;

public interface MilkingProjection {

	public Long getId();
	public String getIdentification();
	public LocalDateTime getInitialTime();
	public LocalDateTime getFinalTime();
	public Double getTotalMilk();
	public String getOperator();
	Double getMilkQuantity();

}
