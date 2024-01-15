package constructor;

public class ConstructorString 
{
 String name;//variable declaration 
 
 public ConstructorString() //variable initalization 
 {
 name="vaishnavi";
 }
 public ConstructorString (String x)//single parameter
 {
	 name=x;
	 
 }
	public static void main(String[] args) 
	{
		ConstructorString n1=new ConstructorString();
				n1.say();
				
				ConstructorString n2= new ConstructorString("pranav");
						n2.say();
						
						ConstructorString n3= new ConstructorString("rohini");
						n3.say();
	}
	public void say()
	{
		System.out.println("my name is "+name);
	}

}
