package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	public List<Country> findByNameContaining(String x);

	public List<Country> findByNameContainingOrderByName(String x);

	public List<Country> findByNameStartingWith(String x);

}
