package polymorphism;

public class Over_Loading {
	
	public void sub (int a,int b,int c)
	{   int sub=a-b-c;
		System.out.println("substraction is "+sub);
	}
	public void sub (int a,int b)//same method name but different parameters passed 
	{    int sub=a-b;
		System.out.println("substraction is "+sub);
	}
	

	

}
