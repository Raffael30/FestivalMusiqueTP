package com.inti.service;

import java.util.List;

import com.inti.model.Oeuvre;

public interface IOeuvreService {
	
	public List<Oeuvre> getAllOeuvre();
<<<<<<< HEAD
	public Oeuvre saveOeuvre(Oeuvre oeuvre);
	public Oeuvre getOeuvre(Long num);
=======

	public Oeuvre save(Oeuvre oeuvre);

	public Optional<Oeuvre> getOeuvre(int num);

>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
	public boolean updateOeuvre(Oeuvre oeuvre);
<<<<<<< HEAD
	public void deleteOeuvre(Long num);
	public long getOeuvreCount();


=======

	public void deleteOeuvre(int num);
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
}
