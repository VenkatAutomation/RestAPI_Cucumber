package Abstraction;

interface Food                           
{
	String item = "Kurbani Ka Meeta";    //by deafult Access Modifires will "public , static , final" in interface for variables

	void Biryani();    //by deafult Access Modifires will "public , abtract" in interface for methods 
	void Icecream();
	void Sweet();
	
	static void Cake()
	{
		System.out.println("Red Velvet Cool Cake");
	}
}

public class InterfaceChild implements Food
{
	
	public void Biryani()
	{
		System.out.println("Mutton Biryani");
	}
	
	public void Icecream()
	{
		System.out.println("Masqati Black Current");
	}
	
	public void Sweet()
	{
		System.out.println("Kalakan");
	}
	
	public static void main(String[] args) {
		
		InterfaceChild ic = new InterfaceChild();
		
		ic.Biryani();
		ic.Icecream();
		ic.Sweet();
		Food.Cake();
		System.out.println(Food.item);
	}

}
