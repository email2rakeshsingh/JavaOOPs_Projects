package Contandgetter;

public class Car {

	private int weel;
	private String color;
	private int Door;
	private int headlight;
	private boolean autostart;

	public Car(int weel, String color, int door, int headlight, boolean autostart) {
		super();
		this.weel = weel;
		this.color = color;
		Door = door;
		this.headlight = headlight;
		this.autostart = autostart;
	}

	public int getWeel() {
		return weel;
	}

	public String getColor() {
		return color;
	}

	public int getDoor() {
		return Door;
	}

	public int getHeadlight() {
		return headlight;
	}

	public boolean isAutostart() {
		return autostart;
	}

}
