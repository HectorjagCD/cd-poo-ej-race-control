package es.campusdual.racecontrol;

import java.util.Iterator;
import java.util.Random;

public class Coche {

	private String brand;
	private String model;
	public static final int MAX_SPEED = 370;
	private int speed;
	private String garageSticker;
	private Double traveledDistance;
	
	// distancia recorrida attb DOUBLE

	public Coche(String brand, String model, int speed, String garageSticker, Double traveledDistance) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.garageSticker = garageSticker;
		this.traveledDistance=traveledDistance;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getGarageSticker() {
		return garageSticker;
	}

	public void setGarageSticker(String garageSticker) {
		this.garageSticker = garageSticker;
	}

	public Double getTraveledDistance() {
		return traveledDistance;
	}

	public void setTraveledDistance(Double traveledDistance) {
		this.traveledDistance = traveledDistance;
	}
	
	
	public void speedUp(int speed) {
			setSpeed(getSpeed()+speed);
			if (getSpeed()>=MAX_SPEED) {
				setSpeed(MAX_SPEED);
			} 
	}
	public void speedDown(int speed) {
		setSpeed(getSpeed()+speed);
		if (getSpeed()<=0) {
			setSpeed(0);
		} 
	}

	public String getDetails() {
		return "Coche [brand=" + brand + ", model=" + model + ", speed=" + speed + ", garageSticker=" + garageSticker
				+ ", traveledDistance=" + traveledDistance + "]";
	}
	
	public Double calcTraveledDistanceKm(int speed, int minutes) {
		double speedPerMinute= (double)speed/60;
		return speedPerMinute * minutes;
	}
	
	public void distanceSpeedInRace(int minutes) {

		for (int i=1; i<=minutes; i++){
			
			System.out.println(getRandomBoolean()); 
		}
		
		// traveledDistance=0.0;
	}
	
	public boolean getRandomBoolean() {
	    Random random = new Random();
	    return random.nextBoolean();
	}
	
	// mtd acelerar(10) , frenar(-10), calcular Distancia, cambiavelocidad -->
	// random true/false true +10 false -10
	// bucle duracion minutos carrera que llame metodos

}
