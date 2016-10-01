
import java.util.*;


public class Animal {

	/* public available to anyone*/
	/* Static available to the every animal object being created*/
	/* final : the value is constant and cannot be changed
	 * Note: Final classes can't be subclasssed and also cannot be overridden*/
	/* double the variable type*/
	public static final double FAVNUMBER = 1.8612;
	//private can be accessed by other methods in the classes
	
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long UniqueID;
	private char Favchar;
	private double speed;
	private float height;
	
	//protected the value can only be accessed by other class by package
	
	protected static int numberofAnimals = 0;
	
	//scanner is gonna accept the user input from the keyboard
	
	static Scanner userInput = new Scanner(System.in);

	public Animal() {
		numberofAnimals++;
		
		int sumofNumbers = 5 +1;
		System.out.println("5 + 1 = " +sumofNumbers);
		
		int diffofNumbers = 5 -1;
		System.out.println("5 - 1 = " +diffofNumbers);
		
		int MulofNumbers = 5 * 1;
		System.out.println("5 * 1 = " +MulofNumbers);
		
		System.out.print("Enter the name:\n");
	
		if(userInput.hasNextLine())
			
		{
		this.setName(userInput.nextLine());
		}
	
	this.setUniqueID();
	this.setFavchar();
	
	
	}
		
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getWeight() {
		return weight;
	}




	public void setWeight(int weight) {
		this.weight = weight;
	}




	public boolean isHasOwner() {
		return hasOwner;
	}




	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}




	public byte getAge() {
		return age;
	}




	public void setAge(byte age) {
		this.age = age;
	}




	public long getUniqueID() {
		return UniqueID;
	}




	public void setUniqueID(long UniqueID) {
		this.UniqueID = UniqueID;
		System.out.println("ID is set to " +this.UniqueID);
	
	}


	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000;
		this.UniqueID = minNumber + (long)(Math.random() * ((maxNumber - minNumber) + 1));
		String stringNumber = Long.toString(maxNumber);
		int numberString = Integer.parseInt(stringNumber);
		
		
	}



	public char getFavchar() {
		return Favchar;
	}




	public void setFavchar(char favchar) {
		Favchar = favchar;
	}

	
	public void setFavchar() {
		int randomNumber = (int)(Math.random() *126) + 1;
		
		this.Favchar = (char) randomNumber;
		
		if(randomNumber == 32)
		{
			System.out.println("Fav character set to Space");
			
		}else if(randomNumber == 10)
			
			System.out.println("Fav character set to NewLine");
		else
			
		{
		System.out.println("Fav Character set to " + this.Favchar);	
		}
		
		
	if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91)))
		
	{
		
		System.out.println("Fav character is a letter");
	}
		
	int whichisBigger = (50 > randomNumber) ? 50: randomNumber;
	
	switch(randomNumber)
	{
	case 8:
		
		System.out.println("Fav character set to backspace");
		break;
		
case 9:
		
		System.out.println("Fav character set to backspace2");
		break;
		
case 7:
	
	System.out.println("Fav character set to backspace3");
	break;
	
case 6:
	
	System.out.println("Fav character set to backspace4");
	break;
	
	default: 
		
	System.out.println("Something");
	
	}
	
	}



	public double getSpeed() {
		return speed;
	}




	public void setSpeed(double speed) {
		this.speed = speed;
	}




	public float getHeight() {
		return height;
	}




	public void setHeight(float height) {
		this.height = height;
	}


protected static void countTo(int startingNumber)

{
	
for (int i = startingNumber; i <=100; i++)
{
 
	if (i == 90)
		continue;
	
	System.out.println(i);

}
}
	
	
protected static String printNumbers(int maxNumbers)

{	

	int i = 1;
	
	while(i < (maxNumbers/2))
		
	{
		
		System.out.println(i);
		i++;
		
		if(i == (maxNumbers/2)) 
			break;
		
	}
	
	
 Animal.countTo(maxNumbers/2);
 
 return "End of PrintNumbers" ;

}



protected static void GuessMe()


{
	
	int number;
	
	do {
		
		
  System.out.println("Guess Number up to 100");
  
  while(!userInput.hasNext())
  {
	  
	  String numberEntered = userInput.next();
	System.out.printf("%s is not a number\n ", numberEntered);
	
	 
}

  number = userInput.nextInt();
	}while(number != 50);

System.out.println("Sorry buddy");

}


public String makeSound()
{

	return "Grrrrrrrrr";
}

public static void speakAnimal(Animal randAnimal)

{
System.out.println("Animal Says " +randAnimal.makeSound());	

}

	public static void main(String[] args)
	
	{
		Animal theAnimal  = new Animal();
		
		String[] Array = {"Jeffy", "Immanuel", "Jeffeson"};
		for (String word: Array)
		{
			
			System.out.println(word);
		}
	}
	
	//System.in getting the data from keyboard
	
	
	
}
