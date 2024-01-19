package com.inti.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Oeuvre;
import com.inti.repository.IOeuvreRepository;

@Service
public class IOeuvreServiceImpl implements IOeuvreService{

	@Autowired
	IOeuvreRepository ioeuvreRepository;

	@Override
	public List<Oeuvre> getAllOeuvre() {
		return ioeuvreRepository.findAll();
	}

	@Override
	public Oeuvre saveOeuvre(Oeuvre oeuvre) {
		if(oeuvre != null) {
			return ioeuvreRepository.save(oeuvre);
		}
		return null;
	}

	@Override
	public Oeuvre getOeuvre(Long num) {
		if(Objects.nonNull(num)) {
			return ioeuvreRepository.getReferenceById(num);
		}
		return null;
	}

	@Override
	public boolean updateOeuvre(Oeuvre oeuvre) {
		if(Objects.nonNull(oeuvre)) {
			ioeuvreRepository.save(oeuvre);
			return true;
		}
		return false;
	}

	@Override
	public void deleteOeuvre(Long num) {
		if(Objects.nonNull(num)) {
			ioeuvreRepository.deleteById(num);
		}
		
	}

	@Override
	public long getOeuvreCount() {
		return ioeuvreRepository.count();
	}

}
