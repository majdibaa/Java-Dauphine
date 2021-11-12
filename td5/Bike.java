package fr.dauphine.javaavance.td5;


public class Bike extends Vehicle{
	public Bike(String brand) {
		super(brand,100L);
	}
	public Bike(String brand, Discount dis) {
		super(brand,100L);
		if(dis!=null) {
			this.setValue(dis.getValue());
		}
	}
}
