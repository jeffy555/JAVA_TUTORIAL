package WritingToFile;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("names.txt"));
			
			
			String lines;
			
		lines =	br.readLine();
			
			while(lines != null)
		
			{
				System.out.println(lines);
			}
		}
			catch(IOException e)
			{
	e.printStackTrace();			
			} finally
			{
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
	}	
		
		
	}
