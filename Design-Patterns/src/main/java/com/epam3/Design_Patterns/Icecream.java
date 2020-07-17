package com.epam3.Design_Patterns;

public abstract class Icecream {
  String description="Unknown Icecream";
  public String getDesc()
  {
	  return description;
  }
  public abstract int getCost();
}
