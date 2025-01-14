package inter.prj.bike;

import inter.prj.vehicle.Vehicle;

public class Bike implements Vehicle{
	
	private int gear;
	private int speed;
	final int maxspeed = 180;
	
	@Override
	public void gearChange(int a) {
		
		if(a > 0)
		{
			gear = a;
			System.out.println("Gear : " + gear);
		}
		else
		{
			System.out.println("Gear cannot be negative");
		}
		
	}

	@Override
	public void speedChange(int a) {
		
		if(a < maxspeed)
		{	
			speed = speed + a;
			System.out.println("Speed Changed : " + a);
		}
		else
		{
			System.out.println("Speed cannot be changed");
		}
		
	}

	@Override
	public void applyBreaks(int a) {
		
		speed = speed - a;
		System.out.println("Reduced speed : " + speed);
		
	}
	
	public void display()
	{
		System.out.println("Speed : " + speed);
		System.out.println("Gear : " + this.gear);
	}
	
}
