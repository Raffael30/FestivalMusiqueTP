package com.inti.service;

import java.util.List;

import com.inti.model.Concert;


public interface IConcertService {
	
	public List<Concert> getAllConcert();
	public Concert saveConcert(Concert concert);
	public Concert getConcert(Long num);
	public boolean updateConcert(Concert concert);
	public void deleteConcert(Long num);
	public long getConcertCount();

}
