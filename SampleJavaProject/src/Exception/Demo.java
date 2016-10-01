package Exception;

public class Demo {

	public static void main(String[] args) {
		
		
		//Test commit
		
		try {

			
			
			int a = 100/0;
			
			
		}
		
		catch(ArithmeticException e)
		{
			
			System.out.println(e);
		}
		
		
		
		try {
int b[] = new int[2];
			
System.out.println(b[4]);
		}
		
		
		catch(ArrayIndexOutOfBoundsException eq)
		{
			
			System.out.println(eq);
		}

		
		System.out.println("completed......");
		
	}
	
}
