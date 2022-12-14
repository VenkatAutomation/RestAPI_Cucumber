package Enacpsulation;


class Load
{

	private String name;
	private int age;
	private int roll;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
	public int getRoll()
	{
		return roll;
	}
	
	public void setRoll(int roll)
	{
		this.roll=roll;
	}


}

public class EncapsulationDemo extends Load
{
	public static void main(String[] args) {
		
		EncapsulationDemo en = new EncapsulationDemo();
		
		en.setName("Venkat");
		System.out.println(en.getName());
		
		en.setAge(25);
		System.out.println(en.getAge());
		
		en.setRoll(005);
		System.out.println(en.getRoll());
		
		
	}
	

}
