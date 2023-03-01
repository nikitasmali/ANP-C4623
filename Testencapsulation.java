package corejava;

public class Testencapsulation 
{

	public static void main(String[] args) 
	{
		// creating object of class encapsulationexample
		encapsulationexample a=new encapsulationexample();
		//Object is used to access the methods of a class
		a.setId(1);
		a.setName("Nikita");
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName());
		}

}
