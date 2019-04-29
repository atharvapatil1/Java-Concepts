class concat
{
	public static void main(String args[])
	{
		String s=50+30+"Atharva"+40+40;
		System.out.println(s);
	}
}


class lowercase
{
	public static void main(String args[])
	{
		String s="DATA STRUCTURE";
		String s.lower=s.toLowerCase();
		System.out.println(s.lower);
	}
}


class uppercase
{
	public static void main(String args[])
	{
		String s="DATA STRUCTURE";
		String s.upper=s.toUpperCase();
		System.out.println(s.upper);
	}
}

class substring
{
	public static void main(String args [])
	{
		Sring s="AtharvaCollege";
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(2));
	}
}

class stringbuffer
{
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("Hello");
		s.append("Java");
		System.out.println(s);
	}
}