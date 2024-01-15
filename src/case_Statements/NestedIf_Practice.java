package case_Statements;

public class NestedIf_Practice {

	public static void main(String[] args) {
//if card is not inserted right then insert the card correctly 
		//else choose the payment mode
		//atm if the pin is coorect then enter the amount 
		//else enter the correct pin
		
		String account="saving account";
		String pin ="6754";
		
		if (account=="saving account")//outer if
		{
			System.out.println("enter the pin");
		if (pin=="674")//inner if
		{
			System.out.println("collect the money");
		}
		else//inner else statement
		{
			System.out.println("enter the correct pin");
		}
		}
		else//outer else statement
		{
			System.out.println("choose the correct account for withdrawing");
		}

	}

}

