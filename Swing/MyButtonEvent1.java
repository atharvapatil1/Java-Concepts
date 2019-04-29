

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // package for event handling

class MyFrame extends JFrame implements ActionListener //ActionListener calls actionPerformedfor event handling
{
	JButton btn1=new JButton ("RED");
	JButton btn2=new JButton ("YELLOW");
	JButton btn3=new JButton ("GREEN");
	
	Container c;
	
	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		btn1.setBounds(100,50,100,50); // created 3 button 
		btn2.setBounds(300,50,100,50);
		btn3.setBounds(500,50,100,50);
		
		btn1.addActionListener(this); //added action to to the buttonand this is written bcoz the method actionPerformed is in the same class of this otherwise we have to call the object of that class for event handling
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		c.add(btn1);// buttons added in the components in frame.
		c.add(btn2);
		c.add(btn3);
	}
	
	public void actionPerformed(ActionEvent e) // method is created in which parameters is passed and obj is created for this method i.e "e".
	
	{
	    if(e.getSource()==btn1)//getSource() is the inbuilt method which is used to perform action after certain action .
		{
			c.setBackground(Color.RED);
		}
		if(e.getSource()==btn2)
		{
			c.setBackground(Color.YELLOW);
		}
		if(e.getSource()==btn3)
		{
			c.setBackground(Color.GREEN);
		}
	}
}
class MyButtonEvent1
{
	public static void main(String [] args)
	{
		MyFrame f =new MyFrame();
		f.setTitle("Event Handling");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,700,500);
	}
}









