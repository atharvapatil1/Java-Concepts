class BoxConMain 
{
	public static void main(String args [])
	{
		BoxCon b1=new BoxCon();
		BoxCon b2=new BoxCon(11,12,13);
		BoxCon b3=new BoxCon(10);
		double v1,v2,v3;
		v1=b1.Volume();
		v2=b2.Volume();
		v3=b3.Volume();
		System.out.println("Volume of Box1 is :"+v1);
		System.out.println("Volume of Box2 is :"+v2);
		System.out.println("Volume of Box3 is :"+v3);
	}
}