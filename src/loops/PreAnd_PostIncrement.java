package loops;

public class PreAnd_PostIncrement {

	public static void main(String[] args) {
	
		int a=10;
		System.out.println(a);
		
		int i;
		i=a++;//1st assign the value then increment
		{
			System.out.println(a);
			System.out.println(i);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int b=12;
		System.out.println(b);
		int c;
		c=b++;//first assign the value then increment 
		{
			System.out.println(b);
			System.out.println(c);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int z=10;
		System.out.println(z);
		int y=++z;//1st increment then assign
		{
			System.out.println(z);
			System.out.println(y);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int x=20;
		System.out.println(x);
		int w=x--;//1st assign the value then decrement
		{
			System.out.println(w);
			System.out.println(x);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int o=100;
		System.out.println(o);
		int j=--o;//1st decrement then assign
		{
			System.out.println(o);
			System.out.println(j);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}
