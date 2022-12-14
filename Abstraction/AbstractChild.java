package Abstraction;


abstract class Abstract                        //abstract class
{
 
	abstract void Bike();                       //abstract method
	
	public void Car()                           //concrete method 
	{
		System.out.println("Maruti Suzuki Scross");
	}

}

public class AbstractChild extends Abstract
{

	void Bike()                                  //implementing abstract method
	{
		System.out.println("Apache RTR 160");
	}
	
	public static void main(String[] args) {
		AbstractChild ac = new AbstractChild();
		ac.Bike();
		ac.Car();
	}
	
}
