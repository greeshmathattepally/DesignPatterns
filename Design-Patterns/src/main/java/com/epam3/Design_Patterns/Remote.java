package com.epam3.Design_Patterns;

public class Remote {
 Command c;
 public Remote() {	 
 }
 public void setCommand(Command c)
 {
	 this.c=c;
 }
 public void pressButton()
 {
	 c.execute();
 }
 
}
