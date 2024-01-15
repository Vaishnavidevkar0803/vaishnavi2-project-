package constructor;

public class String_Constructor 
{
	String password;//declaration
	
	public String_Constructor()
	{
		password="Vaish@08";	
		
	}
	public String_Constructor(String a)//SINGLE PARAMETER
	{
		password=a;
	}

	public static void main(String[] args)

	{
		//to call the construtor we need to create the object 
		String_Constructor p=new String_Constructor(); 
				p.display();			
		 String_Constructor p1=new String_Constructor("pranav@2112");
				p1.display();
	}
	
	
	public void display()//non static method 
	{
		System.out.println(password+" is my password");
		
		
	}

}
