/**
 * 
 */
package com.github.zakariandys.impl;

import com.github.zakariandys.common.VehicleInterface;

/**
 * @author Zakaria Andy S
 *
 */
public class Car implements VehicleInterface{
	private String brand;
	private String type;
	private String engine;
	private String transmision;
	private String fuel;
	private String motion;
	
	public Car(){
		brand="";
		type="";
		engine="";
		transmision="";
		fuel="";
	}
	
	public Car(String brand, String type, String engine, String transmision,
			String fuel) {
		this.brand = brand;
		this.type = type;
		this.engine = engine;
		this.transmision = transmision;
		this.fuel = fuel;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getMotion() {
		return motion;
	}
	public void setMotion(String motion) {
		this.motion = motion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car [brand="+brand+
				"; type="+type+
				"; engine="+engine+
				"; transmision="+transmision+
				"; fuel="+fuel+"]";
	}

	public void move() {
		// TODO Auto-generated method stub
		System.out.println(motion);
	}
	
	

}
