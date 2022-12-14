package Polymorphism;


class Ride
{

	public void Bike()
	{
		System.out.println("KMPH");
	}


}

public class OverRiding extends Ride
{
	public void Bike()
	{
		System.out.println("KMPL");
	}
	public static void main(String[] args) 
	{
	
		OverRiding or = new OverRiding();
		or.Bike();
		
	}

}
