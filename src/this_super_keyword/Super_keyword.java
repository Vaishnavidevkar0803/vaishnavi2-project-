package this_super_keyword;

public class Super_keyword extends This_Use {
	String name="rohini";
	int birthdate=14;

	public static void main(String[] args)
	{
		 Super_keyword key=new  Super_keyword();
				 key.display();
	
	}

	public void display()
	{
		String name="gaurav";
		int birthdate=30;
		System.out.println("my name is "+name);
		System.out.println("my birthdate is "+birthdate);
		System.out.println("...............................");
		System.out.println("my name is "+this.name);
		System.out.println("my birthdate is "+this.birthdate);
		System.out.println(".................................");
		System.out.println("my name is "+super.name);
		System.out.println("my birthdate is "+super.birthdate);
System.out.println("........................");



		
	}
}
