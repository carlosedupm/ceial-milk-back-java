package com.ceial.milkbackendjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceial.milkbackendjava.entities.Milking;

@Repository
public interface MilkingRepository extends JpaRepository<Milking, Long> {

}
