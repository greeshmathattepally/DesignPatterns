package com.epam3.Design_Patterns;

public class ChocochipsTopping extends ToppingsDecorator{
	Icecream i;
    public ChocochipsTopping(Icecream i)
    {
    	this.i=i;
    }
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		
		return i.getDesc()+" with Chocochips Topping";
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return i.getCost()+50;
	}
}
