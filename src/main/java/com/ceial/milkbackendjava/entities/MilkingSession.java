package com.ceial.milkbackendjava.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "milkingSessionPK")
@Entity
@Table(name = "tb_milking_session")
public class MilkingSession {
	
	@EmbeddedId
	private MilkingSessionPK milkingSessionPK = new MilkingSessionPK();
	private Double milkQuantity;
	
	public MilkingSession(Milking milking, Cow cow, Double milkQuantity) {
		this.milkingSessionPK.setMilking(milking);
		this.milkingSessionPK.setCow(cow);
		this.milkQuantity = milkQuantity;
	}

}
