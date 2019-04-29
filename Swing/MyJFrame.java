import javax.swing.*;
import java.awt.*;
class MyJFrame
{
	public static void main(String[] args)
	{
		JFrame f =new JFrame();
		f.setVisible(true); // It visible the frame 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // It close or exit the frame after execution
		//f.setSize(700,500);// It give the size to the frame (width,height)
		//f.setLocation(100,90); // It gives location to the frame eg. frame on left side or corner or middle by entering dimension (left pixel,top pixel).
		f.setBounds(300,100,700,500);// It work as combination of both setLocation and setSize as (setLocation,setSize).
		f.setTitle("My JFrame");// It give title to the Jframe.
		// To Insert Image to JFrame Icon
		   ImageIcon icon =new ImageIcon("Wallpaper.png"); // to insert image in frame icon we hv to create obj of class ImageIcon and pass the path of image in ()
		   f.setIconImage(icon.getImage());// Call the obj in setIconImage method with .getImage().
		
		// For Background purpose
		   Container c = f.getContentPane();//Container Class is in java.awt package.Container is also used in to store the frame in it and add the component in it.
		   c.setBackground(Color.RED);
		
		// To Disable the size button in JFrame
           f.setResizable(false);	// true if enable the sizable button
	}
}