package encapsulation;

public class Person {
	
	private String name="jhon";
	private int age =21;
	private char gender='M';

	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.info();
		p1.getName();
		
	}
	public void info()
	{
		System.out.println("my name is "+name);
		System.out.println(age+" is my age");
		System.out.println(gender+" is my gender");
		
	}
	
	public int getName()
	{
		int a=5;
		return a ;
	}
	
}
