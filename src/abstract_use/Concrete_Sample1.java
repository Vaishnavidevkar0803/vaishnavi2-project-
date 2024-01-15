package abstract_use;

public class Concrete_Sample1 extends Abstract_Sample1{

	public static void main(String[] args)
	{
		Concrete_Sample1 c=new Concrete_Sample1();
				c.test();
				c.test1();
				c.test2();
				c.test3();
				
				c.test6();
				
				 Abstract_Sample1.test5();//calling static method from another class 
				test4();//calling static method from the same class
	}
  
public void test2()
{
	System.out.println("incompleted abstract method completed in concrete class");
}
public void test1()
{
	System.out.println("it is method from the same class");
}
public void test3()
{
	System.out.println("it is method from the same class");
}
public static void test4()
{
	System.out.println("it is static method from the concrete class");
}
public void test6()
{
	System.out.println("it is incompleted static method from abstract class completed in concrete class");
}
}
