package Recursion;

public class RecursionExample {
	
	public static int Factorial(int a)
	{
		if (a <=1 )
			return 1;
		else return(a * Factorial(a - 1));
		
	}
	
	public static void main(String[] args) {
		System.out.println(Factorial(5));
		
	}

}
