class Multithreading extends Thread
{
	public void run()
	{
		System.out.println("task one");
	}
	public static void main(String args [])
	{
		Multithreading t1=new Multithreading();
		Multithreading t2=new Multithreading();
		Multithreading t3=new Multithreading();
		t1.start();
		t2.start();
		t3.start();
		
	}
}