class BoxCon
{
	private double width,height,depth;
	public BoxCon(double w,double d,double h)
	{
		width= w;
		depth= d;
		height= h;
	}
	public BoxCon()
	{
		width=depth=height= 0;
	}
	public BoxCon(double s)
	{
		width=depth=height= s;
	}
	public double Volume()
	{
		double v;
		v=width*depth*height;
		return v;
	}
}