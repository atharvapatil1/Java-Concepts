abstract class A
{
	public abstract void display();
	public void show()
	{
		System.out.println("super class");
	}
}
class Bl extends A
{
	public void display()
	{
		System.out.println("Subclass");
	}
}