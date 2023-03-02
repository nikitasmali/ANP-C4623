package corejava;

class Animal
{
	//method
	public void display()
	{
		System.out.println("Inside parent class");
	}


}
//child class
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Barks......!");
	
	}
}
class puppy extends Dog
{
	public void run()
	{
		System.out.println("He runs by small steps...");
	}
}
class Tester
{
	public static void main(String[] args)
	{
		//creating object of child class
		puppy d=new puppy();
		d.display();
		d.sound();
		d.run();
	}
}

