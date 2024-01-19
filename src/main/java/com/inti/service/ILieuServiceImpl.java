package com.inti.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Lieu;
import com.inti.repository.ILieuRepository;


@Service
public class ILieuServiceImpl implements ILieuService{

	@Autowired
	ILieuRepository iLieuRepository;

	@Override
	public List<Lieu> getAllLieu() {
		return iLieuRepository.findAll();
	}

	@Override
	public Lieu saveLieu(Lieu lieu) {
		if(lieu != null) {
			return iLieuRepository.save(lieu);
		} else {
			return null;
		}
		
	}


	@Override
	public Lieu getLieu(Long num) {
		if(Objects.nonNull(num)) {
			return iLieuRepository.getReferenceById(num);
		}
		return null;
	}

	@Override
	public boolean updateLieu(Lieu lieu) {
		if(Objects.nonNull(lieu)) {
			iLieuRepository.save(lieu);
			return true;
		}
		return false;
	}

	@Override
	public void deleteLieu(Long num) {
		if(Objects.nonNull(num)) {
			iLieuRepository.deleteById(num);
		}
	}
	
	@Override
	public long getLieuCount() {
		return iLieuRepository.count();
	}

}
