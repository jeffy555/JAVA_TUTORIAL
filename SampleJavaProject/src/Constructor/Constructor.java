package Constructor;

public class Constructor {

	public static void main(String[] args) {
		
		
		
		Cube cube = new Cube();
		Cube cube1 = new Cube(5,6,4);
		Cube cube2 = new Cube(3.14,4);
		Cube cube3 = new Cube(2,3.14,6);
		System.out.println("Volume of Cube"+cube.VolumeofCube());
		System.out.println("Volume of Cube"+cube1.VolumeofCube());
		System.out.println("Area of Circle"+cube2.AreaofCirlce());
		System.out.println("Perimeter of Circle"+cube3.PerimeterofCirlce());
		
		
	}
	
	
	
}
