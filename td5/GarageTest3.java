package fr.dauphine.javaavance.td5;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest3 {

	@Test(expected = IllegalStateException.class)
	public void carRentalCarAndCamel2() {
		Garage garage = new Garage();
		garage.remove(new Bike("Cannondale"));
	}

	@Test 
	public void firstCarByBrand() {
		Vehicle v1 = new Car("BMW", 15000, null);	//car 15000e without discount
		Vehicle v2 = new Bike("Renault", null);
		Vehicle v3 = new Bike("Renault", null);
		Garage garage = new Garage();
		garage.add(v1);
		garage.add(v2);
		garage.add(v3);
		assertSame(v1, garage.firstCarByBrand("BMW"));
		assertSame(v2, garage.firstCarByBrand("Renault"));
	}

	@Test
	public void getValue() {
		Vehicle v1 = new Car("BMW", 15000, null);
		Bike v2 = new Bike("Renault", null);
		Garage garage = new Garage();
		garage.add(v1);
		garage.add(v2);
		assertEquals(v1.getValue() + v2.getValue(), garage.getValue());
	}

	@Test
	public void findACarByBrand() {
		Garage garage = new Garage();
		garage.add(new Car("Ford", 2020));
		garage.add(new Bike("Cannondale"));
		assertEquals(new Car("Ford", 2020), garage.firstCarByBrand("Ford"));
	}


	@Test
	public void findACarByModel2() {
		Garage garage = new Garage();
		garage.add(new Car("Ford", 2020));
		garage.add(new Bike("Cannondale"));

		assertNull(garage.firstCarByBrand("Renault"));
	}


	@Test
	public void protect() {
		Garage garage = new Garage();
		garage.add(new Car("Ford", 2020));
		garage.add(new Car("Ford", 2010));
		garage.add(new Car("Renault", 1910));
		garage.protectionism("Ford");
		assertEquals(garage.getValue(), 1910);
	}
}