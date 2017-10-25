package com.javarnd.training.hibernate.dto;

import javax.persistence.Entity;

@Entity
/*@DiscriminatorValue("Bike")*/
public class TwoWheeler extends Vehicle {

	static {
		System.out.println("TwoWheeler static block");
	}
	
	public TwoWheeler() {
		System.out.println("\t TwoWheeler default constructor");
	}

	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

	@Override
	public String toString() {
		return "TwoWheeler [steeringHandle=" + steeringHandle + "]";
	}
	
	
	
}
