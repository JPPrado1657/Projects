import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int px;
	private int py;
	private Color color;
	private Imagen soldadura;
	public Ball(){
		px=50;
		py=50;
		soldadura=new Imagen(8);
	}
	public void paint(Graphics g){
		soldadura.paint(g);
	}

}
