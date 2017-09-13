
/*EL PROGRAMA*/
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;



public class main {
		
	public static void main (String[] args) throws FileNotFoundException, IOException{
		MyWindow window = new MyWindow();
		MyWindow2 window2=new MyWindow2();
		Sound sound=new Sound();
		
		while(window.getCanvas().getUsb().isFin()==false){
			window.setVisible(true);
			window.setSize(1280,700);
		}
		if(window.getCanvas().getUsb().isFin()==true){
			window2.setVisible(true);
			window2.setSize(1280,720);
			
			
			
		}
		
		window.setVisible(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
}
