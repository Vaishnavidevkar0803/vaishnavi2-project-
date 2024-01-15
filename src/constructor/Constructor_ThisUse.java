package constructor;

public class Constructor_ThisUse {
	
	static String fruit;//global variable
  
	public Constructor_ThisUse()
	{
		fruit="mango";//const used to initialize the variable
		
	}

	public static void main(String[] args)
	{
		Constructor_ThisUse ct=new Constructor_ThisUse();
		ct.display();

	}
	
	public void display ()
	{
		String fruit="apple";//local variable 
		System.out.println("vaishnavi's fav fruit is "+fruit);
	    System.out.println("radha's fav fruit is "+Constructor_ThisUse.fruit);//using this keyword to call the global variale
	}

}
