package case_Statements;

public class Else_If_Statements {

	public static void main(String[] args) {
		int marks=50;
		if(marks>=80)//in else if statements u have to go from bottom totop or in decending order
		{
			System.out.println("You are in dist");
		}
		else if(marks>=50)
		{
			System.out.println("u r 2nd class pass");
		}
		else if (marks>=35) 
		{
			System.out.println("You have only passing marks");
		}
		if(marks<=34) 
		{
			System.out.println("you are fail");
		}
	}

}
