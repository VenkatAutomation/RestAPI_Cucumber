package Inheritance;

public class Inherit1 extends Inherit
{
       //inherit1 will aquire the properties of inherit
	   //inherit is the parent class for inherit1
	String str = "Automation";
	
	public static void main(String[] args) 
	{
		
	
		Inherit1 in = new Inherit1();
		in.Add();
		System.out.println(in.st);
		
		System.out.println(in.str);
	}
}
