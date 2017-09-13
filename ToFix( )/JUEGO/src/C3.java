import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Timer;

public class C3 extends Canvas implements ActionListener{
	private BufferedImage img;
	private int x, y, s1, s2;
	private String srcName="Imagenes/INTRO2.png";
	
	private boolean op;
	
	public C3(){
		srcName="Imagenes/j.png";
		x=0;
		y=0;
		s1=1280;
		s2=720;
	
		op=true;
		 File srcFile= new File(srcName);
			try{
				img=ImageIO.read(srcFile);
				
			}catch(IOException e){
				e.printStackTrace();
			}
	}
	 public void paint(Graphics g){
		 File srcFile= new File(srcName);
			try{
				img=ImageIO.read(srcFile);
				
			}catch(IOException e){
				e.printStackTrace();
			}
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
