package com.jordanproject.themepark.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ThemeParkRide {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String description;
	private int thrillFactor;
	private int vomitFactor;
	
	public ThemeParkRide(@NotEmpty String name, @NotEmpty String description, int thrillFactor, int vomitFactor) {
		super();
		this.name = name;
		this.description = description;
		this.thrillFactor = thrillFactor;
		this.vomitFactor = vomitFactor;
	}
	
	

}
