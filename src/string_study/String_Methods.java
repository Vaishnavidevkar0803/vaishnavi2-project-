package string_study;

public class String_Methods {

	public static void main(String[] args)
	{
	//length
		String a="vaishnavi devkar";
		int alength=a.length();
		System.out.println("length of the string is "+alength);
		System.out.println("---------------------------------------");
		
		//toupparcase
		//to lowercase
		
		String b="Pranav";
		String uppercase=b.toUpperCase();
		System.out.println(uppercase);
		
		String lowercase=b.toLowerCase();
		System.out.println(lowercase);
		System.out.println("-----------------------");
		
		//.equals checks only length
		//.equalsIgnorecase checks casewise 
		String x1="gaurav";
		String x2="gaurav";
		String x3="Gaurav";
		
		String x4=new String("Gaurav");
		String x5=new String("Gaurav");
		String x6=new String("gaurav");
		
		boolean result=x1.equals(x2);
		System.out.println(result);
		System.out.println(x2.equals(x3));
		System.out.println(x3.equalsIgnoreCase(x2));//case sensitive
		System.out.println(x1==x2);//from same pool area
		System.out.println(x4==x5);
		System.out.println(x6==x2);
		System.out.println(x3==x1);
		System.out.println("----------------------");
		
		//.contains(CASE SENSITIVE)
		
		String c="Rohini";
		System.out.println(c.contains("o"));
		System.out.println(c.contains("ini"));
		System.out.println(c.contains("Rini"));
		System.out.println(c.contains("r"));//case sensitive
		System.out.println(c.contains("R"));
		System.out.println("--------------------------");
		
		//.empty sees the space
		String d="chauhan";
		String e="";
		String f=" ";//there's space
		System.out.println(d.isEmpty());
		System.out.println(e.isEmpty());
		System.out.println(f.isEmpty());
		System.out.println("---------------------");
		
		//.is blank doesn't count the same space only see the characters present 
		System.out.println(d.isBlank());
		System.out.println(e.isBlank());
		System.out.println(f.isBlank());
		System.out.println("------------");
		
		//charAT
		
		String g="gayatri";
		String h="RACHANA";
		System.out.println(g.charAt(4));
		System.out.println(h.charAt(3));
		System.out.println("-----------------------");
		
		//endswith
		//startswith
		String i="beautiful";
		System.out.println(i.endsWith("ful"));
		System.out.println(i.startsWith("uti"));
		System.out.println(i.startsWith("bea"));
		System.out.println("-----------------------");
		System.out.println(i.startsWith("bea", 0));
		System.out.println("------------------");
		
		//substring
		String j="vaish devkar prabha";
		System.out.println(j.substring(9));
		System.out.println(j.substring(0, 6));
		System.out.println(j.subSequence(0, 18));
		System.out.println("------------------");
		
		////concat
		String j1="vaishnavi";
		String j2="gaurav";
		System.out.println(j1.concat(" ").concat(j2));
		System.out.println(j2.concat(" ").concat(j));
		System.out.println("--------------------");
		
		//intedxof
		//lastindexof
		
		String s1="potato";
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.indexOf('t'));
		System.out.println(s1.lastIndexOf('t', 7));
		System.out.println("------------------");
		
		//replace
		String z="india";
		System.out.println(z.replace('i', 'I'));
		System.out.println(z.replaceFirst("i", "I"));
	
		
		
	}

}
