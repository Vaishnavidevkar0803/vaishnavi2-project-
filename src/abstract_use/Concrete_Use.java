package abstract_use;

public class Concrete_Use extends Abstract_use
{

	public static void main(String[] args)
	{
		Concrete_Use c1=new Concrete_Use();
		c1.test4();
		
	}

	@Override
	public void test4() 
	{
		System.out.println("completed in concrete class");
		
	}
	
	
	
	

}
