package com.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.inti.model.Oeuvre;

@Service
public interface IOeuvreService {

	public List<Oeuvre> getAllOeuvre();

	public Oeuvre save(Oeuvre oeuvre);

	public Optional<Oeuvre> getOeuvre(int num);

	public boolean updateOeuvre(Oeuvre oeuvre);

	public void deleteOeuvre(int num);
}
