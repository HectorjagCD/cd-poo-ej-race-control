package es.campusdual.racecontrol;

import java.util.HashSet;
import java.util.Set;

public class Control {
	public static void main(String[] args) {

//        crear coches y probar
		System.out.println("Velocidad máxima coche: " + Coche.MAX_SPEED);
		Coche coche1 = new Coche("Chevrolet", "Camaro ZL1", 0, "Super Chevy", 0.0);

		coche1.speedUp(15);
		System.out.println(coche1.getSpeed());
		coche1.speedUp(40);
		System.out.println(coche1.getSpeed());
		coche1.speedUp(300);
		System.out.println(coche1.getSpeed());

		coche1.speedUp(1);
		System.out.println(coche1.getSpeed());
		coche1.speedUp(20);
		System.out.println(coche1.getSpeed());
		coche1.speedDown(-50);
		System.out.println(coche1.getSpeed());

		System.out.println("Velocidad actual: " + coche1.getSpeed() + " km/h");
		int minutos = 120;
		System.out.println("Distancia recorrida en " + minutos + " minutos: "
				+ coche1.calcTraveledDistanceKm(coche1.getSpeed(), minutos) + " KM");

		System.out.println(coche1.getDetails());
		coche1.distanceSpeedInRace(5);

			
		
		
	}
}
