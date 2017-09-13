import java.awt.BorderLayout;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class MyWindowNivel1 extends JFrame{
	private C3 canvas3;
	
	public MyWindowNivel1(){
		canvas3=new C3();
		setLayout(new BorderLayout());
		add(canvas3, BorderLayout.CENTER);	
		setVisible(true);
	}
}
