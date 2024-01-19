package com.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.inti.model.Soliste;

@Service
public interface ISolisteService {

		public List<Soliste> getAllSoliste();
		
		public Soliste save(Soliste soliste);
		
		public Optional<Soliste> getSoliste(int num);
		
		public boolean updateSoliste(Soliste soliste);
		
		public void deleteSoliste(int num);
}
