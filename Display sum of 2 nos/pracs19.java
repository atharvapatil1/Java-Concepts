import java.applet.Applet;
import java.awt.*;
/*<applet code="pracs19" width="400" height="400"></applet>*/
public class pracs19 extends Applet
{
	TextField t1, t2;
		public void init()
		{
			t1 = new TextField(10);
			t2 = new TextField(10);

			add(t1);
			add(t2);

			t1.setText("10");
			t2.setText("30");
		}

	public void paint(Graphics g)
	{
		Font italicFont = new Font("Serif", Font.ITALIC, 24);
		g.setFont(italicFont);
		g.setColor(Color.blue);
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		g.drawString("Sum of the numbers is "+(n1+n2),150,150);
	}
}



