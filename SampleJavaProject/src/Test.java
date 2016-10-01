import java.io.*;
public class Test {

	public static void main(String[] args) {

		
		int radius = 0;
		System.out.println("Enter the Radius");
		
		try
		{
			BufferedReader fbr = new BufferedReader(new InputStreamReader(System.in));
			radius = Integer.parseInt(fbr.readLine());
			
		}
		
	catch(NumberFormatException e)
	
	{
		System.out.println("Invalid Radius value" + e);
		System.exit(0);
		
		
	}
		
		catch(Exception ne)
		
		{
			System.out.println("Invalid Radius value" + ne);
			System.exit(0);
			
			
		}
	
	
		double area = Math.PI * radius * radius;
        
        System.out.println("Area of a circle is " + area);
	}
}
