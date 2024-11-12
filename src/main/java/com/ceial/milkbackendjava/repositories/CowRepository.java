package com.ceial.milkbackendjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceial.milkbackendjava.entities.Cow;

@Repository
public interface CowRepository extends JpaRepository<Cow, Long> {

}
