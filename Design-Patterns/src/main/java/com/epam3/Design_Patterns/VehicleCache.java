package com.epam3.Design_Patterns;

import java.util.HashMap;

public class VehicleCache{
	private static HashMap<String,Prototype> hm=new HashMap<String,Prototype>();
	public static Prototype getVehicle(String id)
	{
		return (Prototype)hm.get(id).clone();
	}
	public static void LoadCache() {
		Bike b=new Bike();
		b.setId("1");
		hm.put(b.getId(), b);
		Car c=new Car();
		c.setId("2");
		hm.put(c.getId(), c);
		
	}
}
