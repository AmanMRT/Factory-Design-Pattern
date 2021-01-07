package FactoryDesign;
/*RULES
 * 1.-> Create abstract class or Interface
 * 2.-> Create class and Implement Interface.
 * 3.-> Add factory class and add one Factory Method
 * 4.-> Use Factory Class in any other class
*/
//Factory Design is used to create object explicitly i.e without mannually (Dog d = new Dog();)

public class AnimalFactory 
{
	public static Animal getAnimal(String animalType)
	{
		Animal animal = null;
		if(animalType.equalsIgnoreCase("Dog"))
		{
			animal = new Dog();
		}
		else if(animalType.equalsIgnoreCase("Cat"))
		{
			animal = new Cat();
		}
		
		return animal;
	}
}
