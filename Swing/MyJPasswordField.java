import javax.swing.*;
import java.awt.*;
class MyJPasswordField
{
	public static void main(String[] args)
	{
		JFrame frame =new JFrame();
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setBounds(300,100,700,500);
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		//CREATE THE PASSWORD FIELD
		JPasswordField pass=new JPasswordField();
		pass.setBounds(100,100,100,30);
		
		// ADD FONT TO PASSWORD FIELD
		Font f= new Font("Arial",Font.BOLD,25);
		pass.setFont(f);
		
		// ADD COLOR,BACKGROUNG,FOREGROUND TO PASSWORD FIELD
		pass.setBackground(Color.YELLOW);
		pass.setForeground(Color.RED);
		c.add(pass);
	}
}