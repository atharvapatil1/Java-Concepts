class Box
{
	private double width;
	private double height;
	private double depth;
	public void setDimension(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	public double Volume()
	{
		double v ;
		v=width*depth*height;
		return v;
	}
}