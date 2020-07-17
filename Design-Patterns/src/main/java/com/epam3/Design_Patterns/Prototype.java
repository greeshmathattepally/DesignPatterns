package com.epam3.Design_Patterns;
//import java.util.HashMap;
public abstract class Prototype implements Cloneable{
   private String id;
   String type;
   abstract void drive();
   public String getType() {return type;}
   public String getId() {return id;}
   public void setId(String id) {
	   this.id=id;
   }
   public Object clone()
   {
	   Object clone=null;
	   try {
		   clone=super.clone();
	   }
	   catch(CloneNotSupportedException e)
	   {
		  e.printStackTrace(); 
	   }
	   return clone;
   }
}



