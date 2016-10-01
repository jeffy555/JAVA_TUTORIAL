//Cat is not good
/*welcome to java programming*/

public class Cat extends Animal {



public Cat()
{
	
}

public String makeSound()

{
	return "meow";
	
}


public static void main(String[] args) {
	
	Animal Doggie = new Dog();
	Animal Fluffy = new Cat();
	
	
	Animal[] theAnimals = new Animal[10];
	
	theAnimals[0] = Doggie;
	theAnimals[1] = Fluffy;
	
	
	System.out.println("Doggie says" + theAnimals[0].makeSound() );
	System.out.println("Fluffy says"+ theAnimals[1].makeSound());
	
	
	
	
	speakAnimal(Fluffy);
	speakAnimal(Doggie);
	
	
	
	
}

}