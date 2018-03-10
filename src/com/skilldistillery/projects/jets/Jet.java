package com.skilldistillery.projects.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
		System.out.println("Now, you can");
		System.out.println("   FLY");
		System.out.println("         LIKE");
		System.out.println("                AN");
		System.out.println("                     EAGLE");
		System.out.println();
		System.out.println("Flying high in your " + this.model + " at the price of " + this.price + ",");
		System.out.println("you are able to fly " + (this.range / this.speed) + "miles,");
		System.out.println("since your range is " + this.range + " at your top speed of " + this.speed + " MPH or " + getMach() + "mach.");
	}
	
	public double getMach() {
		return (this.speed / 761.21);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}
