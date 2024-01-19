package com.inti.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Soliste;
import com.inti.repository.ISolisteRepository;


@Service
public class ISolisteServiceImpl implements ISolisteService{
	
	@Autowired
	ISolisteRepository isolisteRepository;
	
	@Override
	public List<Soliste> getAllSoliste() {
		return isolisteRepository.findAll();
	}

	@Override
	public Soliste saveSoliste(Soliste soliste) {
		if(soliste != null) {
			return isolisteRepository.save(soliste);
		} else {
			return null;
		}
		
	}


	@Override
	public Soliste getSoliste(Long num) {
		if(Objects.nonNull(num)) {
			return isolisteRepository.getReferenceById(num);
		}
		return null;
	}

	@Override
	public boolean updateSoliste(Soliste soliste) {
		if(Objects.nonNull(soliste)) {
			isolisteRepository.save(soliste);
			return true;
		}
		return false;
	}

	@Override
	public void deleteSoliste(Long num) {
		if(Objects.nonNull(num)) {
			isolisteRepository.deleteById(num);
		}
	}
	
	@Override
	public long getSolisteCount() {
		return isolisteRepository.count();
	}

}
