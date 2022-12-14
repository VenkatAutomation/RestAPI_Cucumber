package Abstraction;

                     //Multiple inheritance in Java by interface

interface Plane
{  
	
void Model(); 

}  

interface Jet
{
	
void Force();

}   

public class MInheritance implements Plane,Jet
{
	public void Model()
	{
		System.out.println("Kingfisher");
	}
	
	public void Force()
	{
		System.out.println("Air Force");
	}  
	  
	public static void main(String args[])
	{  
		MInheritance mi = new MInheritance();  
		
	mi.Model();  
	mi.Force();
	
	 }  
	} 
	

