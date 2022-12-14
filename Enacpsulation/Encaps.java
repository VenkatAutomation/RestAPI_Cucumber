package Enacpsulation;

public class Encaps extends Load
{

	public static void main(String[] args) {
		
		Encaps en = new Encaps();
		
		en.setName("Venkat");
		System.out.println(en.getName());
		
		en.setAge(25);
		System.out.println(en.getAge());
		
		en.setRoll(005);
		System.out.println(en.getRoll());
		
	}
	
}
