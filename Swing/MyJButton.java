import javax.swing.*;
import java.awt.*;
class MyJButton
{
	public static void main(String[] args)
	{
		JFrame frame =new JFrame();
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setBounds(300,100,700,500);
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		//CREATE BUTTON
		JButton btn=new JButton("Click Me");
		btn.setBounds(100,80,100,30);
		
		//SET TEXT TO BUTTON 
		btn.setText("Atharva");// "Click Me" will be over write to "Atharva" .this is used in event handling.
		
		//SET IMAGE IN BUTTON
		ImageIcon icon =new ImageIcon("Wallpaper.png");
		JButton btn1=new JButton(icon);
		btn1.setBounds(100,160,icon.getIconWidth(),icon.getIconHeight());
		
		//SET FONT TO BUTTON TEXT
		JButton btn2=new JButton("Click");
		btn2.setBounds(100,120,100,30);
		Font f=new Font ("Arial",Font.ITALIC,20);
		btn2.setFont(f);
		  
		//ADD COLOR,BACKGROUNG,FOREGROUND TO BUTTON 2
		btn2.setBackground(Color.BLUE);
		btn2.setForeground(Color.YELLOW);
		
		//CURSOR SETTINGS
		Cursor cur=new Cursor(Cursor.HAND_CURSOR); /* create obj of Cursor class and pass the parameters for type of cursor
		Types
        WAIT_CURSOR,CROSSHAIR_CURSOR*/
		Cursor cur1=new Cursor(Cursor.WAIT_CURSOR);
		btn.setCursor(cur);
		btn2.setCursor(cur1);
		
		c.add(btn);
		c.add(btn1);
		c.add(btn2);
	}
}