package com.inti.service;

import java.util.List;

import com.inti.model.Chef;

public interface IChefService {
	
	public List<Chef> getAllChef();
	public Chef saveChef(Chef chef);
	public Chef getChef(Long num);
	public boolean updateChef(Chef chef);
	public void deleteChef(Long num);
	public long getChefCount();

}
