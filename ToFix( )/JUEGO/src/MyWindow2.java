
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MyWindow2 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private MyCanvas2 canvas;
	public MyWindow2(){
	super();
	canvas=new MyCanvas2();
	setLayout(new BorderLayout());
	add(canvas, BorderLayout.CENTER);
	
	
	
}
}