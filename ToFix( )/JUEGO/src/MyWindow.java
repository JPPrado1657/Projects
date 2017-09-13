import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MyWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private MyCanvas canvas;
	private boolean buleana;
	
	public MyWindow(){
		super();
		canvas=new MyCanvas();
		setLayout(new BorderLayout());
		add(canvas, BorderLayout.CENTER);	
		setVisible(true);
		buleana=true;
	}
	
	public boolean gVisible(){
		return buleana;
	}

	public MyCanvas getCanvas() {
		return canvas;
	}

	public void setCanvas(MyCanvas canvas) {
		this.canvas = canvas;
	}

	public boolean isBuleana() {
		return buleana;
	}

	public void setBuleana(boolean buleana) {
		this.buleana = buleana;
	}
	
	
}
