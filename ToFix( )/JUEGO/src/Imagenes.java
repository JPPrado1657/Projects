import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Imagenes {
	
	private BufferedImage img;
	private Random r;
	private int px, py;
	private int size;
	
	public Imagenes(int x, int y){
		r=new Random();
		String srcName="Imagenes/soldadura1.png";
		int imagen=r.nextInt(5)+1;
		px=x;
		py=y;
		size=10;
		switch(imagen){
		case 1:
			srcName="Imagenes/soldadura1.png";
			break;
		case 2:
			srcName="Imagenes/soldadura2.png";
			break;
		case 3:
			srcName="Imagenes/soldadura3.png";
			break;
		case 4:
			srcName="Imagenes/soldadura4.png";
			break;
			
		}
		
		File srcFile= new File(srcName);
		try{
			img=ImageIO.read(srcFile);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}
	
	public void paint (Graphics g){
		g.drawImage(img, px, py, size,size, null);
	}

}
