package com.example.services;

import java.util.List;

import com.example.entities.SubSector;

public interface SubSectorService {

	    void saveSubSector(SubSector subSector);
	    SubSector getSubSectorById(int subSectorId);
	    List<SubSector> getAllSubSectors();
		SubSector getSubSectorsBySectorId(int sectorId); 
	    void deleteSubSector(int subSectorId);
}
