package variables;

public class NonStatic_Variables {
	
int v=8;
	public static void main(String[] args)
	{
		 NonStatic_Variables n=new  NonStatic_Variables();
				 n.display();
				 System.out.println("value of v after calling by non static is "+n.v);//objectname.variablename
				 //non static global variable from same class  
				 
				 NonStatic_AnotherClass b1=new  NonStatic_AnotherClass();
				 System.out.println("value of v is "+b1.v);//calling non static global variable from
				 //another class
	}
	public void display()
	{
		int g=30;
		System.out.println("value of g is "+g);
	}

}
