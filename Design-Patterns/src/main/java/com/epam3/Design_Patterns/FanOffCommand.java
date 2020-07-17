package com.epam3.Design_Patterns;

public class FanOffCommand implements Command{

	
	Fan f;
	FanOffCommand(Fan f)
	{
		this.f=f;
	}
	public void execute() {
		// TODO Auto-generated method stub
		f.off();
	}

}
