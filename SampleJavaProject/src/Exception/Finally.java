package Exception;

public class Finally
{
	
	public static int Value()
	
	{
	
int a = 100;
		
		try {
		
		//a=a/0;
		
		
		return a; 
		
		
		
		} catch(Exception e)
		
		{
		 System.out.println("Caught Exception" + e);
		 return a;
		}

		
		finally 
		{
			 a = 6000;
			System.out.println("Finally called");
	
				return a;
		}
		
}
		
		
		
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Value());
		
	}
	
	
	
}