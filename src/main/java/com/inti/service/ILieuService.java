package com.inti.service;

import java.util.List;

import com.inti.model.Lieu;



public interface ILieuService {
	
	public List<Lieu> getAllLieu();
	public Lieu saveLieu(Lieu lieu);
	public Lieu getLieu(Long num);
	public boolean updateLieu(Lieu lieu);
	public void deleteLieu(Long num);
	public long getLieuCount();

}
