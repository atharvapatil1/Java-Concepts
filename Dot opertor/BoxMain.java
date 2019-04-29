class BoxMain
{
	public static void main(String [] args)
	{
		Box b1=new Box();
		Box b2=new Box();
		b1.setDimension(10,20,30);
		b2.setDimension(12,13,15);
		double v1,v2;
		v1=b1.Volume();
		v2=b2.Volume();
		System.out.println("Volume of Box 1 is "+v1);
		System.out.println("Volume of Box 2 is "+v2);
	}
}