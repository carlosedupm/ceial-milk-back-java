package com.ceial.milkbackendjava.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ceial.milkbackendjava.entities.Milking;
import com.ceial.milkbackendjava.projections.MilkingProjection;

@Repository
public interface MilkingRepository extends JpaRepository<Milking, Long> {

	@Query("SELECT m.id, m.identification as identification, m.initialTime as initialTime, m.finalTime as finalTime, m.totalMilk as totalMilk, m.operator as operator, ms.milkQuantity as milkQuantity FROM Milking m join fetch MilkingSession ms on m.id = ms.milkingSessionPK.milking.id WHERE ms.milkingSessionPK.cow.id = :cowId")
	public List<MilkingProjection> findByCowId(Long cowId); 
}
