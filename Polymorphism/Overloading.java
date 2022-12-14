package Polymorphism;

class Addition
{
	public int Add(int x, int y)
	{
		return  x+y;
	}
}

public class Overloading extends Addition
{
	public int Add(int x, int y,int z)
	{
		return x+y+z;
		
	}
	
	public static void main(String[] args) {
		
		Overloading or = new Overloading();
		
		System.out.println(or.Add(10, 20, 30));
		
	}

}
