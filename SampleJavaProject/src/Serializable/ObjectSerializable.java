package Serializable;

import java.io.*;
import java.util.*;


public class ObjectSerializable {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
	
		File file = new File("students.txt");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Jefferson", 7.04));
		students.add(new Student("George", 7.03));
		students.add(new Student("Immanuel", 7.02));
		
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutputStream obj = new ObjectOutputStream(fo);
		for(Student s: students)
		{
			obj.writeObject(s);
			
		}
		obj.close();
		fo.close();
		
		
		
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream object = new ObjectInputStream(fi);
		ArrayList<Student> students2 = new ArrayList<Student>();
		try{
			while(true)
			{
				Student s = (Student)object.readObject();
				students2.add(s);
			}
		} catch (EOFException ex){
			
		}
		
		for(Student s : students2)
		{
			System.out.println(s);
		}
		
	}
	
}
