
public class Swap {

	public static void main(String[] args) {
		
		int number1=10;
		int number2=20;
		
		System.out.println("Values before swapping");
		System.out.println("The value of number1 is" +number1);
		System.out.println("The value of number2 is" +number2);
		
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("Values after swapping");
		System.out.println("The value of number1 is" +number1);
		System.out.println("The value of number2 is" +number2);
		
		
		
	}
}
