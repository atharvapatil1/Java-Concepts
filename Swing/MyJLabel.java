import javax.swing.*;
import java.awt.*;
class MyJLabel
{
	public static void main(String[] args)
	{
		JFrame frame =new JFrame();
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setBounds(300,100,700,500);
		frame.setTitle("My JLabel");
	    Container c = frame.getContentPane();//Container Class is in java.awt package.Container is also used in to store the frame in it and add the component in it.
		c.setLayout(null);//this is use bcoz whatever we add in it ,it goes to any location ,to avoil it we use it 
		JLabel l =new JLabel("Username");
		l.setText("Password");//this will give name to the label if this is not mention then default name would be Username as it is pas while creating obj of Jlabel
		l.setBounds(100,50,200,30);//dimension for label.(Left,top,width,height)
		
		//FONT SIZE OF LABEL
		Font f = new Font("Arial",Font.BOLD,30); // to create the font we creeate obj of Font("Font type",plain/bold/italic,font size)
		l.setFont(f);
		c.add(l);// we added lebel l in container c in which jframe j resides.
		
		//ADD IMAGE TO JFRAME BY JLABEL
		ImageIcon icon=new ImageIcon("Wallpaper.png");
		JLabel l1 =new JLabel(icon);
		l1.setBounds(100,250,icon.getIconWidth(),icon.getIconHeight());//here we have given wodth and height of original image if not wanted then we can give acc to us 
		c.add(l1); 	
	}
}