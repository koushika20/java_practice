class Animal
{
	void print()
	{
		System.out.println("Running");
		}
}
class Cat extends Animal{
	void print()
	{
		System.out.println("Sweeping");
	}
}

public class Demo {

	public static void main(String[] args) 
	{

		Cat c1=new Cat();
		c1.print();

	}

}
