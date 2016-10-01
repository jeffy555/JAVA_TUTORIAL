package Inheritance;

public class MyExample {

	public static void main(String[] args) {
	
	Triangle tri = new Triangle();
	Rectangle rec = new Rectangle();
	tri.set_values(4, 8);
	rec.set_values(5, 5);
	
	System.out.println(tri.area());
	System.out.println(rec.area());
}
}
