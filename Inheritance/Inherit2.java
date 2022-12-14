package Inheritance;

public class Inherit2 extends Inherit1
{
	//inherit2 will aquire the properties of inherit1
		//inherit1 is the parent class for inherit2
	
	
	int roll = 005;
	
	public static void main(String[] args) {
		
		Inherit2 in = new Inherit2();
		
		in.Add();
		System.out.println(in.st);
		System.out.println(in.str);
		System.out.println(in.roll);
		
		
	}

}
