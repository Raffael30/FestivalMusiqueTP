package com.inti.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Chef;
import com.inti.model.Lieu;
import com.inti.repository.IChefRepository;
import com.inti.repository.ILieuRepository;

@Service
public class IChefServiceImpl implements IChefService{
	
	@Autowired
	IChefRepository iChefRepository;

	@Override
	public List<Chef> getAllChef() {
		return iChefRepository.findAll();
	}

	@Override
	public Chef saveChef(Chef chef) {
		if(chef != null) {
			return iChefRepository.save(chef);
		} else {
			return null;
		}
		
	}


	@Override
	public Chef getChef(Long num) {
		if(Objects.nonNull(num)) {
			return iChefRepository.getReferenceById(num);
		}
		return null;
	}

	@Override
	public boolean updateChef(Chef chef) {
		if(Objects.nonNull(chef)) {
			iChefRepository.save(chef);
			return true;
		}
		return false;
	}

	@Override
	public void deleteChef(Long num) {
		if(Objects.nonNull(num)) {
			iChefRepository.deleteById(num);
		}
	}
	
	@Override
	public long getChefCount() {
		return iChefRepository.count();
	}

}
