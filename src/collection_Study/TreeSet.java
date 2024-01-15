package collection_Study;

public class TreeSet {

	public static void main(String[] args)
	//Treeset-
	//1.DataStructure =balance tree
	//2.capacity =no default capacity 
	//3.best=remove duplicate when order of insertion is accending 
	//
	{
     //TreeSet<Object> tree=new java.util.TreeSet<>();
      java.util.TreeSet<Object> tree= new java.util.TreeSet<>();
      tree.add(98);
      tree.add(80);
      tree.add(70);
      tree.add(30);
      tree.add(40);
      tree.add(80);
      tree.add(80);
     // tree.add("vaish"); class case exception
    //  tree.add('f'); class case exception
     // tree.add(56.90);class case exception
      System.out.println(tree);
//      tree.add("vaish");
//      tree.add("vaish");
//      tree.add("adyy");
//     // tree.add(987);class case exception
//      tree.add("pranav");
//    // tree.add(null);//null pointer exception
//      tree.add("gaurav");
//      tree.add("sahil");
//      tree.add("alok");
//      System.out.println(tree);
//      tree.ceiling(2);//Returns the least element in this set greater than or equal 
//      //to the given element, or null if there is no such element.
     
      System.out.println(tree.ceiling(2));
      System.out.println(tree.ceiling(78));
      System.out.println(tree.ceiling(39));
      System.out.println(tree.ceiling(68));
      System.out.println(tree.ceiling(87));
      System.out.println("========================================");
	  System.out.println(tree.floor(0));//Returns the greatest element in this set less than or equal to
	//the given element, or null if there is no such element.
	  System.out.println(tree.floor(87));
	  System.out.println(tree.floor(68));
	  
	}

}
