package com.org.accentLeaflet.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@IdClass(ArchiveID.class)
@Data@AllArgsConstructor@NoArgsConstructor
public class Arch_1004901 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private LocalDateTime date ;
	
	@Id
	private Long id_device ;
	
	private int speed ;
	
	private int fuel ;
	
	private int temp ;
	
	private int X ;
	
	private int Y ;
	
	private int Z ;
	
	private int ignition ;
	
	private int rpm ;
	
	private double fuel_rate ;
	
	private double tfu ;
	
	private double odo ;
	
	private int satInView ;
	
	private int signal ;
	
	private int heading ;
	
	private int charger ;
	
	private double latitude ;
	
	private double longitude ;
	
	private int stat ;
	
	private int tram_id ;
	
	private int validity ;
	
	private int temp_engine ;
	
	private float accum_odo ;
	
	private Integer do1 ;
	
	private Integer do2 ;
	
	private Integer do3 ;
	
	private Integer do4 ;
	
	private Integer di1 ;
	
	private Integer di2 ;
	
	private Integer di3 ;
	
	private Integer di4 ;
	
	private Integer an1 ;
	
	private Integer an2 ;
	
	private Integer an3 ;
	
	private Integer an4 ;
	
}
