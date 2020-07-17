package com.epam3.Design_Patterns;

public class Car extends Prototype
{
	public Car()
	{
		type="Car";
	}
	public void drive()
	{
		System.out.println("Inside Car, drive method");
	}
}