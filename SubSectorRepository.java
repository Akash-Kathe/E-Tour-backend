package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.SubSector;

@Repository
@Transactional
public interface SubSectorRepository extends JpaRepository<SubSector, Integer> {
	
	

}
