package constructor;

public class Constructor_Practice3 {
	
	int a;
	boolean b;
	String c;
	
	public Constructor_Practice3()
	{
		//i haven't initialize values to the variables in constructor
		//therefore the values are 0 and null,false here
	}

	public static void main(String[] args)
	{
		Constructor_Practice3 c=new Constructor_Practice3();
		c.display();
	}
	
	public void display ()
	{
		System.out.println("default value of a is "+a);
		System.out.println("default value of b is "+b);
		System.out.println("default value of c is "+c);
	}

}
