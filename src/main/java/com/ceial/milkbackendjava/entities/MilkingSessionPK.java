package com.ceial.milkbackendjava.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"milking", "cow"})
@Embeddable
public class MilkingSessionPK {

	@ManyToOne
	@JoinColumn(name = "milking_id")
	private Milking milking;

	@ManyToOne
	@JoinColumn(name = "cow_id")
	private Cow cow;
}
