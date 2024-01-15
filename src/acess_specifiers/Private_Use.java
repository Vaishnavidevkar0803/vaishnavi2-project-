package acess_specifiers;

  public class Private_Use {

	 String name="vaish";
	 String behaviour="kind";
	 char gender='F';
	 int v=8;
	
	public static void main(String[] args) 
	{
		Private_Use n=new Private_Use();
				n.display();

	}
	protected void display()
	{
		System.out.println("my name is "+name);
		System.out.println("my beahaviour is "+behaviour);
		System.out.println("my gender is "+gender);
		System.out.println("my fav date is "+v);
	}

}
