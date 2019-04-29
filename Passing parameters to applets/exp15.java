/*<applet code="exp15.class"width=300 height=300>
<param name ="msg" value="Welcome to applet">
</applet>*/
import java.awt.*;
import java.applet.*;
public class exp15 extends Applet
{
	public void paint(Graphics g)
	{
		String str=getParameter("msg");
		g.drawString(str,50,50);
	}
}

//how to run 
//javac exp14.java
//appletviewer exp14.java