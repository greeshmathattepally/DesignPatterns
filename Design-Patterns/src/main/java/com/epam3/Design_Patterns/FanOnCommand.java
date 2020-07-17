package com.epam3.Design_Patterns;

public class FanOnCommand implements Command{
	Fan f;
	FanOnCommand(Fan f)
	{
		this.f=f;
	}
	public void execute() {
		// TODO Auto-generated method stub
		f.on();
	}
}
