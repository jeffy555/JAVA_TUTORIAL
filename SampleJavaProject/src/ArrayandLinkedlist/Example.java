package ArrayandLinkedlist;

import java.util.*;

public class Example {

	public static void main(String[] args) {
		long n = (long) 1E7;
		
		ArrayList arraylist = new ArrayList();
		
		long milsec;
		milsec = System.currentTimeMillis();
		
		for(int i=0;i<n;i++)
		{
			arraylist.add(i);
		}

		System.out.println("Insert array list" + (System.currentTimeMillis()-milsec + "ms"));

		
		LinkedList linked = new LinkedList();
		milsec = System.currentTimeMillis();
		
		
		for(int i=0;i<n;i++)
		{
			linked.add(i);
		}

		System.out.println("Insert linked list" + (System.currentTimeMillis()-milsec + "ms"));

		milsec = System.currentTimeMillis();
		arraylist.remove(1E5);
		System.out.println("Delete from ArrayList" + (System.currentTimeMillis()-milsec + "ms"));
		
		milsec = System.currentTimeMillis();
		linked.remove(1E5);
		System.out.println("Delete from LinkedList" + (System.currentTimeMillis()-milsec + "ms"));

}
}
