package com.inti.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Concert;
import com.inti.model.Soliste;
import com.inti.repository.IConcertRepository;


@Service
public class IConcertServiceImpl implements IConcertService{
	
	@Autowired
	IConcertRepository iConcertRepository;

	@Override
	public List<Concert> getAllConcert() {
		return iConcertRepository.findAll();
	}

	@Override
	public Concert saveConcert(Concert concert) {
		if(concert != null) {
			return iConcertRepository.save(concert);
		} else {
			return null;
		}
		
	}


	@Override
	public Concert getConcert(Long num) {
		if(Objects.nonNull(num)) {
			return iConcertRepository.getReferenceById(num);
		}
		return null;
	}

	@Override
	public boolean updateConcert(Concert concert) {
		if(Objects.nonNull(concert)) {
			iConcertRepository.save(concert);
			return true;
		}
		return false;
	}

	@Override
	public void deleteConcert(Long num) {
		if(Objects.nonNull(num)) {
			iConcertRepository.deleteById(num);
		}
	}
	
	@Override
	public long getConcertCount() {
		return iConcertRepository.count();
	}

}
