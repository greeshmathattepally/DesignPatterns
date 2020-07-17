package com.epam3.Design_Patterns;

public class Singleton {
	static Singleton obj=null;
	private Singleton() {
		System.out.println("In singleton class");
	}
	static Singleton getInstance()
	{
		if(obj==null)
		{
			obj=new Singleton();
		}
		return obj;
	}
}
