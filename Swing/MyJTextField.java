import javax.swing.*;
import java.awt.*;
class MyJTextField
{
	public static void main(String[] args)
	{
		JFrame frame =new JFrame();
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setBounds(300,100,700,500);
		Container c = frame.getContentPane();
		c.setLayout(null);
		// CREATE TEXTFIELD
		JTextField text =new JTextField();
		text.setBounds(100,50,200,40);
		// ADD FONT TO TEXTFIELD
		Font f = new Font ("Arial",Font.BOLD,28);
		text.setFont(f); // Put obj of font in text 
		//SET COLOR,BACKGROUND,FOREGROUND TO TEXTFIELD
		text.setBackground(Color.YELLOW);
		text.setForeground(Color.RED); // color to the written text
		c.add(text); // add text to the container in which is frame is embedded
	}
}