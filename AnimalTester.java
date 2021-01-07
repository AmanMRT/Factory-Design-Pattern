package FactoryDesign;

//rule 3
public class AnimalTester 
{
	public static void main(String[] args)
	{
		//rule 4
		Animal obj = AnimalFactory.getAnimal("DOG");
		obj.speak();
		
		Animal obj1 = AnimalFactory.getAnimal("cat");
		obj1.speak();
		
	}
}
