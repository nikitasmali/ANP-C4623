package corejava;

public class TestStudentClass
{

	public static void main(String[] args)
	{
		// Creating object of class Student
		Student a=new Student();
		a.setId(1);
		a.setName("Nikita");
		a.setAge(20);
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName()+"\n"+"Age:"+a.getAge());

	}

}
