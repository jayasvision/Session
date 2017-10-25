package com.javarnd.training.hibernate.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/*@DiscriminatorValue("Car")*/
public class FourWheeler extends Vehicle {

	static {
		System.out.println("FourWheeler static block");
	}
	
	public FourWheeler() {
		System.out.println("\t FourWheeler default constructor");
	}

	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	@Override
	public String toString() {
		return "FourWheeler [steeringWheel=" + steeringWheel + "]";
	}
	
}
