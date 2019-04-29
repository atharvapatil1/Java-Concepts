class BoxMO
{
	private double width,height,depth;
	public void setDimension(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public void setDimension(double s)
	{
		width=depth=height=s;
	}
	public void setDimension()
	{
		width=depth=height=0;
	}
	public double Volume()
	{
		double v;
		v=width*depth*height;
		return v;
	}
}