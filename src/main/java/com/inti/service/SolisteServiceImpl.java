package com.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Soliste;
import com.inti.repository.ISolisteRepository;

@Service
public class SolisteServiceImpl implements ISolisteService {

	@Autowired
	ISolisteRepository isr;

	@Override
	public List<Soliste> getAllSoliste() {
		return isr.findAll();
	}

	@Override
	public Soliste save(Soliste soliste) {
		return isr.save(soliste);
	}

	@Override
	public Optional<Soliste> getSoliste(int num) {
		return isr.findById(num);
	}

	@Override
	public boolean updateSoliste(Soliste soliste) {
		Soliste solisteToChange = isr.findByNom(soliste.nom);
		if (solisteToChange != null) {
			soliste.num = solisteToChange.num;
			isr.save(soliste);
			return true;
		}
		return false;
	}

	@Override
	public void deleteSoliste(int num) {
		isr.deleteById(num);
	}
}
