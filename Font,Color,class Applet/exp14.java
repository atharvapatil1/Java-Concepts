
import java.applet.*;
import java.awt.*;

/*<applet code="exp14" width=300 height=400></applet>*/

public class exp14 extends Applet
{
	public void paint (Graphics g)
	{
		g.setColor(Color.orange);
		g.drawString("Atharva",50,50);
		g.setColor(Color.red);
		g.fillRect(170,100,50,50);
	}
}

//how to run 
//javac exp14.java
//appletviewer exp14.java