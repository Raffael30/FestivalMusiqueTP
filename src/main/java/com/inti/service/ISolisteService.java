package com.inti.service;

import java.util.List;

import com.inti.model.Soliste;

public interface ISolisteService {
	
	public List<Soliste> getAllSoliste();
	public Soliste saveSoliste(Soliste soliste);
	public Soliste getSoliste(Long num);
	public boolean updateSoliste(Soliste soliste);
	public void deleteSoliste(Long num);
	public long getSolisteCount();

}
