package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.model.Concert;

public interface IConcertRepository extends JpaRepository<Concert, Integer>{

}
