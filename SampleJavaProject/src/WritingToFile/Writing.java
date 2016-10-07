package WritingToFile;
import java.io.*;
public class Writing {


	public static void main(String[] args) {
		
		try
		{
			
		
		File file = new File("names.txt");
		
		if(!file.exists())
		{
			
			
			
			file.createNewFile();
			
		}
			PrintWriter pw = new PrintWriter(file);
			pw.println("Hello");
			pw.println("Travelling to Kolkata");
			pw.println(9.30);
			pw.close();
			System.out.println("Done");
			
		}catch(IOException e)
			{
				System.out.println(e);
			}
		}
}
		
		
		
		
		

		
		
		
		
		
		
		
		
	
	
