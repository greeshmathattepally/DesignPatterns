package com.epam3.Design_Patterns;

public class OreoToppings extends ToppingsDecorator{
    Icecream i;
    public OreoToppings(Icecream i)
    {
    	this.i=i;
    }
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		
		return i.getDesc()+" with Oreo Toppings";
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return i.getCost()+40;
	}
    
}
