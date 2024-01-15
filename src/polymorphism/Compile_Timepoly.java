package polymorphism;

public class Compile_Timepoly {

	

	public static void main(String[] args)
	{
		Compile_Timepoly ct=new Compile_Timepoly();
				ct.display();
				ct.display("radha");
				ct.div();
				ct.div(12,67, 9.98f);
				
				display("gaurav",'M');//STATIC METHOD
				
	
	}
	public void display()
	{   
		String name="vaishnavi";
		System.out.println("my name is "+name);
	}
	
	public void display(String name)
	{   
		
		System.out.println("my name is "+name);
	}
	
	public void div()
	{
		int a=70;
		int b=45;
		int div=a/b;
		System.out.println("division is "+div);
	}
	public void div(int a,int b,float c)
	{
		float div=a/b/c;
		System.out.println("div is "+div);
	}
	public static void display(String a,char m)
	{
		System.out.println("my name is "+a+" & "+"my gender is "+m);
	}
	

}
