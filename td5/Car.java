package fr.dauphine.javaavance.td5;

import java.util.Objects;

public class Car extends Vehicle{
	private final int vetuste;
	
	public Car(String brand, long value, int vetuste) {
		super(brand,value);
		Objects.requireNonNull(vetuste);
		if(vetuste<0 || vetuste>=200) {
			throw new IllegalArgumentException();
		}
		this.vetuste = vetuste;
	}
	public Car(String brand, long value) {
		super(brand,value);
		this.vetuste=0;
	}
	
	public int getVetuste() {
		return vetuste;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + vetuste;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (vetuste != other.vetuste)
			return false;
		return true;
	}
	@Override
	public long getValue() {
		return super.getValue()-(1000L*Integer.toUnsignedLong(this.vetuste));
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marque : "+this.getBrand()+"    Prix : "+(this.getValue()-(1000L*Integer.toUnsignedLong(vetuste))));
		return sb.toString();
	}
}
