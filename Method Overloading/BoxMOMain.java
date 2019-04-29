class BoxMOMain
{
	public static void main(String args [])
	{
		BoxMO b1=new BoxMO();
		BoxMO b2=new BoxMO();
		BoxMO b3=new BoxMO();
		b1.setDimension(10,20,30);
		b2.setDimension(5);
		b3.setDimension();
		double v1,v2,v3;
		v1=b1.Volume();
		v2=b2.Volume();
		v3=b3.Volume();
		System.out.println("Volume of Box1 is :"+v1);
		System.out.println("Volume of Box2 is :"+v2);
		System.out.println("Volume of Box3 is :"+v3);
	}
}