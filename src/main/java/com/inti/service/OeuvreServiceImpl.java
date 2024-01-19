package com.inti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Oeuvre;
import com.inti.repository.IOeuvreRepository;

@Service
public class OeuvreServiceImpl implements IOeuvreService {

	@Autowired
	IOeuvreRepository ior;

	@Override
	public List<Oeuvre> getAllOeuvre() {
		return ior.findAll();
	}

	@Override
	public Oeuvre save(Oeuvre oeuvre) {
		return ior.save(oeuvre);
	}

	@Override
	public Optional<Oeuvre> getOeuvre(int num) {
		return ior.findById(num);
	}

	@Override
	public boolean updateOeuvre(Oeuvre oeuvre) {
		Oeuvre oeuvreToChange = ior.findByNom(oeuvre.nom);
		if (oeuvreToChange != null) {
			oeuvre.num = oeuvreToChange.num;
			ior.save(oeuvre);
			return true;
		}
		return false;
	}

	@Override
	public void deleteOeuvre(int num) {
		ior.deleteById(num);
	}

}
