package MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(Add(2,3));
		System.out.println(Name("Jefferson","Immanuel"));
	}
	
	
	
	public static int Add(int a, int b)
	
	{
		return (a*b);
	}
	
	public static String Name(String A, String B)
	{
		return(A+B);
	}
	
}
