package CPSAT;

import java.util.ArrayList;

public class ArrayListExample {

	
	public static void main(String[] args) {
		// Define ArrayList
		ArrayList<String> aList=new ArrayList<String>();
		
		//Adding Values
		aList.add("India");
		aList.add("Australia");
		aList.add("England");
		aList.add("CHINA");
		System.out.println("values in the array list:" +aList);
		
		//Iterate an element
	for (int i=0; i<aList.size();i++);
	int i = 0;
	{
		
	
	System.out.println(aList.get(i));
	}
	//remove an element
	aList.remove(2);
	System.out.println("after delete:" +aList);
	aList.remove("Australia");
	System.out.println("after delete:" +aList);
	
		
		

	}

}
