package fr.dauphine.javaavance.td5;

import java.util.Objects;

public abstract class Vehicle {
	private final String brand;
	private long value;
	public Vehicle(String brand,long value) {
		Objects.requireNonNull(brand);
		Objects.requireNonNull(value);
		this.brand = brand;
		if(value<0L) {
			throw new IllegalArgumentException();
		}
		this.value = value;
	}
	public Vehicle(String brand,long value,Discount dis) {
		Objects.requireNonNull(brand);
		Objects.requireNonNull(value);
		this.brand = brand;
		if(value<0L) {
			throw new IllegalArgumentException();
		}
		this.value = value;
		if(dis!=null) {
			this.value = dis.getValue();
		}
	}
	public String getBrand() {
		return brand;
	}
	public long getValue() {
		return this.value;
	}
	public void setValue(long value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		return true;
	}
	
}
