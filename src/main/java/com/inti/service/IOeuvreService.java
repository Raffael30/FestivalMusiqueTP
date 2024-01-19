package com.inti.service;

import java.util.List;

import com.inti.model.Oeuvre;

public interface IOeuvreService {
	
	public List<Oeuvre> getAllOeuvre();
	public Oeuvre saveOeuvre(Oeuvre oeuvre);
	public Oeuvre getOeuvre(Long num);
	public boolean updateOeuvre(Oeuvre oeuvre);
	public void deleteOeuvre(Long num);
	public long getOeuvreCount();

}
