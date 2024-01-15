package this_super_keyword;

public class This_Use {
	
	String name="vaish";
	int birthdate=8;
	float height=5.7f;
	char gender='F';

	public static void main(String[] args) 
	{
		This_Use ts=new This_Use();
				ts.display();
		
	}
	public void display()
	{
		String name="pranav";
		int birthdate=21;
		float height=6.1f;
		char gender='M';
		System.out.println("my name is "+name);
		System.out.println("my birthdate is "+birthdate);
		System.out.println("my height is "+height);
		System.out.println("my gender is "+gender);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.");
		
		System.out.println("my birthdate is "+this.birthdate);
		System.out.println("my name is "+this.name);
		System.out.println("my height is "+this.height);
		System.out.println("my gender is "+this.gender);//calling global variable in method
		
	}

}
