package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.SubSector;
import com.example.repositories.SubSectorRepository;

@Service
public class SubSectorServImpl implements SubSectorService {

	 @Autowired
	 SubSectorRepository subsectorrepo;

    @Override
    public void saveSubSector(SubSector subSector) {
    	System.out.println(subSector);
         subsectorrepo.save(subSector);
    }

    @Override
    public SubSector getSubSectorById(int subSectorId) {
        return subsectorrepo.findById(subSectorId);
    }

    @Override
    public List<SubSector> getAllSubSectors() {
        return subsectorrepo.findAll();
    }

	
	 @Override
	 public SubSector getSubSectorsBySectorId(int sectorId)	 { 
		 return	 subsectorrepo.findBySectorId(sectorId); }
	 
    @Override
    public void deleteSubSector(int subSectorId) {
        subsectorrepo.deleteById(subSectorId);
    }

	
}
