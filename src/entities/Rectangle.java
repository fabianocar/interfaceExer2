package entities;

import enums.Color;

public class Rectangle extends AbstractShape {
	
	private Double with;
	private Double height;

	public Rectangle(Color color, Double with, Double height) {
		super(color);
		this.height = height;
		this.with = with;
	}

	public Double getWith() {
		return with;
	}

	public void setWith(Double with) {
		this.with = with;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return with * height;
	}

	
}
