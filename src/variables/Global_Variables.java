package variables;

public class Global_Variables {

	 static int a=30;// static global variable
	 
	public static void main(String[] args)
	{
	//calling global variable from the same class
		 Global_Variables vari=new  Global_Variables();
				 vari.display();
				 System.out.println("value of m is "+GlobalVariable_DifferntClass.m);//calling global variable from another class
				 //syntax=classname.variablename
				 
		
	}
public void display()
{
	int b=78;
	System.out.println("value of b is "+b);
	System.out.println("value of a is "+a);
}
}
