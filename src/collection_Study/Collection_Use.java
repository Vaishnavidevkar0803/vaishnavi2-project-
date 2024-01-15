package collection_Study;

import java.util.ArrayList;

public class Collection_Use {

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<Object>();
		System.out.println(al.add("pune"));
		System.out.println("=============");
		System.out.println(al);
		System.out.println("***********");
		
		al.add(0, "katraj");
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		Object alnew=al.clone();
		System.out.println(al);
		System.out.println("clone method is "+alnew);
		System.out.println("========================");
		System.out.println(al.contains("pune"));//returns boolean
		System.out.println(al.contains("nashik"));
		System.out.println("=======**========");
		al.ensureCapacity(3);// ensure that it can hold at least the number of elements specified 
		//by the minimum capacity argument.????????
		System.out.println("============");
		al.add("vaish");
		System.out.println(al);
		System.out.println("****************");
		System.out.println(alnew);
		System.out.println(al);
		al.equals(alnew);
		System.out.println(al.equals(alnew));
		System.out.println("*******************");
		al.get(2);//string-->charat
		//Returns the element at the specified position in this list
		System.out.println(al.get(2));
		//System.out.println(al.get(29));// IndexOutOfBounds Exception Index 29 out of bounds for length 3
		System.out.println("***************");
		al.indexOf("vaish");
		System.out.println(al.indexOf("vaish"));//2 returns index of the element
		System.out.println(al.indexOf("vaishnavi"));//-1 element not exists
		System.out.println("**********************");
		//al.clear();
		System.out.println(al.isEmpty());//gives true ans if we use clear method return type is boolean
		System.out.println("*******************");
		al.lastIndexOf(1);
		System.out.println(al.lastIndexOf(1));//error -1 ???
		System.out.println("*****************");
		System.out.println(al);
		System.out.println(al.remove(1));//removes the object returns 1index element
		System.out.println(al);
		System.out.println("==*************");
		al.set(1, "velocity");
		System.out.println(al.set(1, "velocity"));//it only replace the element 
		System.out.println(al);
		System.out.println("****************");
		al.size();//length
		System.out.println(al.size());
	}

}
