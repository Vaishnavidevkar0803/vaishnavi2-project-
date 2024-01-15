package collection_Study;

import java.util.LinkedList;

public class LinkedList_Study {

	public static void main(String[] args) 
	{
		LinkedList<Character> Ll=new LinkedList<Character>();
		Ll.add('V');
		Ll.add('A');
		Ll.add('G');
		Ll.add('S');
		Ll.add('N');
		Ll.add('K');
		System.out.println(Ll);
		
		System.out.println(Ll.contains('z'));//boolean retuens false if the element is not present in list
		System.out.println(Ll.contains('v'));//case sensitive
		System.out.println(Ll.contains('V'));
		System.out.println("--------element method-------");
		System.out.println(Ll.element());//retuens head of the list 
		//fetch but does not remove the head(1st element ) from the list 
		//throws no such a element exception if the list is empty 
		System.out.println(Ll);
		System.out.println("--------peek method-------");
		System.out.println(Ll.peek());//fetch but does not remove the head(1st element ) from the list 
		//returns null if the list is empty
		
		System.out.println("--------poll method-------");
		System.out.println(Ll.poll());//fetch and remove the head(1st element ) from the list 
		//returns null if the list is empty
		System.out.println(Ll);//V has been removed 
		
		System.out.println("-------------get method---------------");
		System.out.println(Ll.get(4));//returns the element at the specified index
		//throws index out of boundary exception if the index is out of range
		
		System.out.println(Ll.getFirst());//returns 1st element 
		//throws no such a element exception if the list is empty
		
		System.out.println(Ll.getLast());//returns last element
		//throws no such a element exception if the list is empty
		
		System.out.println("---------offer Method------------");
		Ll.offer('J');//add the element in the list 
		//System.out.println(Ll.offer('J'));//returns true as the element gets added 
		System.out.println(Ll);
		
		Ll.offerFirst('R');//insert the element at start return... type-->boolean
		System.out.println(Ll);
		
		Ll.offerLast('D');//insert element at the end... return type-->boolean
		System.out.println(Ll);
	}

}
