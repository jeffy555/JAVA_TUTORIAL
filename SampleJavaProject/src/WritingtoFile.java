import java.io.*;
import java.util.*;
public class WritingtoFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		File file = new File("test.txt");
		//Writes to the file
		try{
		PrintWriter output = new PrintWriter(file);
		output.println("Jefferson");
		output.println("23");
		output.close();
		
		}
		catch(IOException io){
			
		
		System.out.println("Error is "+io);
		
		}
	//Reads from the file
	Scanner scan = new Scanner(file);
	String name = scan.nextLine();
	int age = scan.nextInt();
	
	System.out.println("Name is " +name+ "\nAge is "+age);
	
	}
	
}
