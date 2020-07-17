package com.epam3.Design_Patterns;

public class Bike extends Prototype
{
	public Bike()
	{
		type="Bike";
	}
	public void drive()
	{
		System.out.println("Inside Bike, drive method");
	}
}
