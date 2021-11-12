package fr.dauphine.javaavance.td5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Garage {
	private LinkedList<Vehicle> cars;
	private final int id;
	private static int nbInstance = 0;
	
	public Garage(Vehicle c) {
		this.cars = new LinkedList<Vehicle>();
		this.cars.add(c);
		this.id = Garage.nbInstance;
		Garage.nbInstance++;
	}
	public Garage() {
		this.cars = new LinkedList<Vehicle>();
		this.id = Garage.nbInstance;
		Garage.nbInstance++;
	}
	public void add(Car c) {
		Objects.requireNonNull(c);
		this.cars.add(c);
	}
	public LinkedList<Vehicle> getCars() {
		return cars;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		if(!this.cars.isEmpty()) {
			StringBuilder str = new StringBuilder();
			Iterator<Vehicle> it = this.cars.iterator();
			int compt = 1;
			while(it.hasNext()) {
				Vehicle temp = it.next();
				str.append("Voiture n°"+compt+" - "+temp+"€\n");
				compt++;
			}
			str.append("Valeur totale du garage : "+this.getValue()+"€");
			return str.toString();
		}
		return "Garage vide";
	}
	public Vehicle firstCarByBrand(String brand) {
		Objects.requireNonNull(brand);
		if(!this.cars.isEmpty()) {
			Iterator<Vehicle> it = this.cars.iterator();
			while(it.hasNext()) {
				Vehicle temp = it.next();
				if(temp.getBrand() == brand) {
					return temp;
				}
			}
		}
		return null;
	}
	public long getValue() {
		long total = 0;
		if(!this.cars.isEmpty()) {
			Iterator<Vehicle> it = this.cars.iterator();
			while(it.hasNext()) {
				Vehicle temp = it.next();
				total+=temp.getValue();
			}
		}
		return total;
	}
	public void remove(Vehicle c) {
		Objects.requireNonNull(c);
		if(this.cars.contains(c)) {
			this.cars.remove(c);
		}else {
			throw new IllegalStateException();
		}
	}
	public void protectionism(String brand) {
		LinkedList<Vehicle> lt = new LinkedList<Vehicle>();
		lt.addAll(cars);
		Iterator<Vehicle> it = lt.iterator();
		while(it.hasNext()) {
			Vehicle temp = it.next();
			if(temp.getBrand()==brand) {
				cars.remove(temp);
			}
		}
	}
	public static void main(String[] args) {
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Garage g = new Garage();
		g.add(a);
		g.add(b);
		g.add(c);
		g.protectionism("BMW");
		System.out.println(g);
	}
}
