package case_Statements;

public class Nested_IfElse {

	public static void main(String[] args)
	{
		String email="vaishnavi30@gmail.com";
		String password="vaish@3004";
		
		if(email=="vaishnavi3@gmail.com")//outer statement
		{
			System.out.println("enter correct password");
			
			if(password=="vaish@300")//inner if statement
			{
				System.out.println("welcome to homepage");
		}
		else//inner else statement
		{
			System.out.println("please enter the correct password");
	}

}
		else//outer else statement 
		{
			System.out.println("enter the correct email id");
		}
	}
}