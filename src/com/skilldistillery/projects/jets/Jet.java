package com.skilldistillery.projects.jets;

import java.text.DecimalFormat;

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

	public void listSpecs() {
		System.out.println("Here is your " + this.model + " at the price of " + this.price + " dollars.");
		System.out.println("Its range is " + this.range + " miles and your top speed is " + this.speed + " MPH or "
				+ getMach() + " mach.");
		System.out.println();
	}

	public void fly() {
		DecimalFormat df = new DecimalFormat("#.#####");
		
		System.out.println("Flying high in your " + this.model + ", you are able to fly for "
				+ df.format(this.range / this.speed) + " hours and " + this.range + " miles.");
		System.out.println();
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
