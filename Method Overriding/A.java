class A
{
	public void show()
	{
	System.out.println("Class A");
	}
}
class B extends A
{
	public void show ()
	{
		System.out.println("Class B");
	    super.show();
	}
}