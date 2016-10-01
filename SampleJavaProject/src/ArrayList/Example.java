package ArrayList;
import java.util.ArrayList;
public class Example {

	
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>(4);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
		for(Integer n: list)
		
		System.out.println(n);
		
		System.out.println("Size of the Array"+list.size());
		
		list.remove(3);
		
		System.out.println("List the array after removing" + list);
		
		list.trimToSize();
		
		
			
		System.out.println("After trimming the size of the aray"
				+ "" + list.size());
		
		
	}
	
}
