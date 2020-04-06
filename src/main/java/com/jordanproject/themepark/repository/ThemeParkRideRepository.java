package com.jordanproject.themepark.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jordanproject.themepark.entity.ThemeParkRide;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {

	List<ThemeParkRide> findByName(String name);
}
