import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyButtonEvent2
{
	 static Container c;
	public static void main(String[] args)
	{
      
	   JFrame frame =new JFrame();
	   frame.setTitle("Event Handling using Anonymous inner class");
	   frame.setVisible(true);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setBounds(200,100,800,500);
	   
	   c=frame.getContentPane();
	   c.setBackground(Color.GREEN);
	   c.setLayout(null);
	   
	   JButton red =new JButton("RED");
	   red.setBounds(100,100,100,35);
	   
	   JButton blue =new JButton("BLUE");
	   blue.setBounds(300,100,100,35);
	   
	   JButton yellow =new JButton("YELLOW");
	   yellow.setBounds(500,100,100,35);
	   
	   c.add(red);
	   
	   c.add(blue);
	   
	   c.add(yellow);
	}
	
}