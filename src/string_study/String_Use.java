package string_study;

public class String_Use {

	public static void main(String[] args) 
	{
		String s="Vaishnavi";
		String s1="vaishnavi";
		String s2="Vaishnavi";
		String s3="Rohini";//constant pool area-->without using new keyword
		
		//non constant pool area-->with using new keyword
		String m1=new String("VAISHNAVI");
		String m2=new String("Vaishnavi");
		String m3=new String("VAISHNAVI");
		String m4=new String(" ");
		
		System.out.println(s==s1);
		System.out.println(s==m2);
		System.out.println(s1==m3);
		System.out.println(s==s1);
		System.out.println(s==s2);//from constant pool area
		System.out.println(m1==m3);
		System.out.println(m2==s2);
		System.out.println(m1.equalsIgnoreCase(m2));//non constatnt pool area 	
		System.out.println(s1.equalsIgnoreCase(s2));//constant pool area
		System.out.println(s3.toUpperCase());
		System.out.println(m3.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(m1.length());
		System.out.println(m4.length());
		System.out.println(m3.charAt(8));
		System.out.println(s3.charAt(4));
		System.out.println(m4.charAt(0));
		System.out.println(m2.contains("aish"));//in sequence
		System.out.println(s3.contains("nihi"));//not in sequence rohini
		System.out.println();
	}

}
