package Constructor;

public class Cube {

	private int height;
	private int length;
	private int breadth;
	private int radius;
	private double pi;
	private int perimeter;
	
	
	public long VolumeofCube()
	{
		return (length * breadth *height);
	}
	
	
	public double AreaofCirlce()
	{
		return (pi* radius * radius);
	}
	
	public double PerimeterofCirlce()
	{
		return (perimeter* pi * radius);
	}
	
	
	Cube(double a, int r)
	{
		
		pi = a;
		radius = r;
		
	}
	
	Cube(int i, double a, int r)
	{
		perimeter = 2;
		pi = a;
		radius = r;
		
	}
	
	Cube()
	{
		
		length = 10;
		breadth = 20;
		height = 50;
		
	}
	
	Cube(int a, int b, int c)
	{
		length = a;
		breadth = b;
		height = c;
		
	}
	
}
