package Polymorphism;

public class Example {

	public static void main(String[] args) {
		
		Car f = new Ford();
		Car m = new Maruti();
		Car v = new Volkswagen();
		
		
		System.out.println("Starting rate of Ford Figo" +  "\t"  +f.getCarAmount());
		System.out.println("Starting rate of Maruti Suzuki" + "\t" +m.getCarAmount());
		System.out.println("Starting rate of Volkswagen Polo" +  "\t"
				+ ""  
		+v.getCarAmount());
		
	}
	
	
}
