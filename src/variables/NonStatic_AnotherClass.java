package variables;

public class NonStatic_AnotherClass {
	
	 String v="vaishnavi";

	public static void main(String[] args) 
	{
		 NonStatic_AnotherClass b=new NonStatic_AnotherClass();
				 b.display();
				 System.out.println("value of v is "+b.v);//objectname.variable name

				 //calling non static global variable from differnt class
				 
				 NonStatic_Variables o=new  NonStatic_Variables();
						 System.out.println("value of v is "+o.v);//objectname.variablename
				//syntax of calling non ststic global variable from another class 
						 //create a object 
				 
	}
public void display()
{
	String g="gaurav";
	System.out.println("value of g is "+g);
}
}
