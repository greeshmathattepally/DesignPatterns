package com.epam3.Design_Patterns;

public class TextBook implements Book{
	public void read()
	{
		System.out.println("Reading");
	}

	@Override
	public void writeAtParts() {
		// TODO Auto-generated method stub
		System.out.println("Writing at some parts ");
	}


}
