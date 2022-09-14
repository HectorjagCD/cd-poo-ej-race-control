package es.campusdual.racecontrol;

public class Coche {
	
	private String brand;
	private String model;
	public static final int MAX_SPEED  = 370;
	private int speedVariaton;
	private String garageSticker;
	
	public Coche(String brand, String model, int speedVariaton, String garageSticker) {
		super();
		this.brand = brand;
		this.model = model;
		this.speedVariaton = speedVariaton;
		this.garageSticker = garageSticker;
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

	public int getSpeedVariaton() {
		return speedVariaton;
	}

	public void setSpeedVariaton(int speedVariaton) {
		this.speedVariaton = speedVariaton;
	}

	public String getGarageSticker() {
		return garageSticker;
	}

	public void setGarageSticker(String garageSticker) {
		this.garageSticker = garageSticker;
	}
	
	
	
}
