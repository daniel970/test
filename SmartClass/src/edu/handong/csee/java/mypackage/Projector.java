package edu.handong.csee.java.mypackage;

public class Projector {
	int mLampTemperature = 20;
	

	public String mDescription = "This is a projector class";
	
	public void turnOn() {
		
		System.out.println("My Project is turning on!!");
		getLampTemperature();
		
	}
	
	public void turnOff() {
		System.out.println("My Project is turning off!!");
	}
	
	private void getLampTemperature() {
		System.out.println("My project temperature is" + mLampTemperature);
	}

}
