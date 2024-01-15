package data_Provider;

import org.testng.annotations.DataProvider;

public class fbPracticeDataHide1 
{

	@DataProvider(name="fbsanity")
	
 public static String [][]fbset()
  
  {
	  String fbdata[][]= {{"vaish@gmail.com","1234"},{"prab@gmail.com","6789"}};
     return fbdata;
  }
  
}
