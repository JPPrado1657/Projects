import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
public class Imagen2 {
	private BufferedImage img;
	private int x, y, size1, size2;
	private boolean isDrag;
	private boolean dir=true;
	private boolean prueba;//mover
	private int eliminar;
	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSize1() {
		return size1;
	}

	public void setSize1(int size1) {
		this.size1 = size1;
	}

	public int getSize2() {
		return size2;
	}

	public void setSize2(int size2) {
		this.size2 = size2;
	}

	public boolean isDrag() {
		return isDrag;
	}

	public void setDrag(boolean isDrag) {
		this.isDrag = isDrag;
	}

	public boolean isDir() {
		return dir;
	}

	public void setDir(boolean dir) {
		this.dir = dir;
	}

	public boolean isPrueba() {
		return prueba;
	}

	public void setPrueba(boolean prueba) {
		this.prueba = prueba;
	}

	public boolean isPrueba2() {
		return prueba2;
	}

	public void setPrueba2(boolean prueba2) {
		this.prueba2 = prueba2;
	}

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

	public int getRand() {
		return rand;
	}

	public void setRand(int rand) {
		this.rand = rand;
	}

	private boolean prueba2;//eliminar
	private Random r;
	private int rand;
 public Imagen2(int op){
	 r=new Random();
		isDrag=false;
		String srcName="Imagenes/fondo1.png";
	 switch(op)
	 {
	 case 1:
		 srcName="Imagenes/fondo1.png";
			x=0;
			y=-5;
			size1=1300;
			size2=700;
			prueba=false;
			prueba2=false;
			System.out.print("si");
			break;
	
	 case 2:
		 srcName="Imagenes/paradabocina.png";
			x=200;
			y=100;
			size1=260;
			size2=450;
			prueba=false;
			prueba2=false;
			System.out.print("si");
			
		 break;
	 case 3:
		 srcName="Imagenes/acostadabocina.png";
			x=500;
			y=160;
			size1=480;
			size2=260;
			prueba=false;
			prueba2=false;
			System.out.print("si");
		 break;
	 case 4:
		 srcName="Imagenes/acostadatapa.png";
			x=500;
			y=160;
			size1=480;
			size2=260;
			prueba=false;
			prueba2=false;
			System.out.print("si");
		 break;
	 case 5:
		 srcName="Imagenes/abajotapa.png";
			x=260;
			y=140;
			size1=145;
			size2=145;
			prueba=true;
			prueba2=false;
			System.out.print("si");
		 break;
	 case 6:
		 srcName="Imagenes/arribatapa.png";
			x=240;
			y=330;
			size1=180;
			size2=180;
			prueba=true;
			prueba2=false;
			System.out.print("si");
		 break;
	 case 7:
		 srcName="Imagenes/basura1.png";
			x=240;
			y=330;
			size1=60;
			size2=60;
			prueba=true;
			prueba2=false;
			System.out.print("si");
			eliminar=0;
		 break;
	 case 8:
		 srcName="Imagenes/basura2.png";
			x=240;
			y=330;
			size1=80;
			size2=80;
			prueba=true;
			prueba2=false;
			System.out.print("si");
			eliminar=0;
		 break;
	 case 9:
		 srcName="Imagenes/bicho.png";
			x=240;
			y=330;
			size1=80;
			size2=80;
			prueba=true;
			prueba2=false;
			System.out.print("si");
			eliminar=0;
		 break;
	 case 17:
		 srcName="Imagenes/j.png";
			x=0;
			y=-5;
			size1=1300;
			size2=700;
			prueba=true;
			prueba2=false;
			System.out.print("si");
			eliminar=0;
		 break;
	 }
	 File srcFile= new File(srcName);
		try{
			img=ImageIO.read(srcFile);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	 }
 
 
 
 
 public Imagen2(int op, int px, int py){
		isDrag=false;
		String srcName="Imagenes/fondo1.png";
	 switch(op)
	 {
	 case 1:
		 srcName="Imagenes/fondo1.png";
			x=0;
			y=-5;
			size1=1300;
			size2=700;
			prueba=false;
			prueba2=false;
			System.out.print("si");
			break;
	
	 case 2:
		 srcName="Imagenes/paradabocina.png";
			x=200;
			y=100;
			size1=260;
			size2=450;
			prueba=false;
			prueba2=false;
			System.out.print("si");
			
		 break;
	 case 3:
		 srcName="Imagenes/acostadabocina.png";
			x=500;
			y=160;
			size1=480;
			size2=260;
			prueba=false;
			prueba2=false;
			System.out.print("si");
		 break;
	 case 4:
		 srcName="Imagenes/acostadatapa.png";
			x=500;
			y=160;
			size1=480;
			size2=260;
			prueba=false;
			prueba2=false;
			System.out.print("si");
		 break;
	 case 5:
		 srcName="Imagenes/abajotapa.png";
			x=260;
			y=140;
			size1=145;
			size2=145;
			prueba=true;
			prueba2=false;
			System.out.print("si");
		 break;
	 case 6:
		 srcName="Imagenes/arribatapa.png";
			x=240;
			y=330;
			size1=180;
			size2=180;
			prueba=true;
			prueba2=false;
			System.out.print("si");
		 break;
	 case 7:
		 srcName="Imagenes/basura1.png";
			x=px;
			y=py;
			size1=60;
			size2=60;
			prueba=true;
			prueba2=false;
			System.out.print("si");
			eliminar=0;
		 break;
	 case 8:
		 srcName="Imagenes/basura2.png";
			x=px;
			y=py;
			size1=50;
			size2=50;
			prueba=true;
			prueba2=false;
			System.out.print("si");
			eliminar=0;
		 break;
	 case 9:
		 srcName="Imagenes/bicho.png";
			x=px;
			y=py;
			size1=50;
			size2=50;
			prueba=true;
			prueba2=false;
			System.out.print("si");
			eliminar=0;
		 break;
	 }
	 File srcFile= new File(srcName);
		try{
			img=ImageIO.read(srcFile);
			
		}catch(IOException e){
			e.printStackTrace();
		}
 }
 
 public int getEliminar() {
	return eliminar;
}

public void setEliminar(int eliminar) {
	this.eliminar = eliminar;
}

public void paint (Graphics g){
		g.drawImage(img, x, y, size1,size2, null);
	}

 public void move (){
	 Random r = new Random();
	 int lx1=500;
	 int lx2=980;
	 int ly1=160;
	 int ly2=420;
	
	 int rand=r.nextInt(4)+1;
	
	 switch(rand){
	 case 1:
		 if(x+70<=lx2){
		 x=x+30;}
		 break;
	 case 2:
		 if(y+70<=ly2){
			 y=y+30;}
		 break;
	 case 3:
		 if(x-30>=lx1){
			 x=x-30;}
		 break;
	 case 4:
		 if(y-30>=ly1){
			 y=y-30;}
		 break;
	 }
	 
 }
}
