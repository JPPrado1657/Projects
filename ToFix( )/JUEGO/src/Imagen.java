

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Imagen {
		
	private BufferedImage img;
	private int x, y, size1, size2;
	private boolean isDrag;
	private boolean dir=true;
	private boolean prueba;
	private Random r;
	private int rand;
	private boolean prueba2;
	private int op;
private boolean je;
	public Imagen(int op){
		this.op=op;
		r=new Random();
		isDrag=false;
		String srcName="Imagenes/a.png";
		switch(op)
		{
			case 1:
			srcName="Imagenes/baseusb.png";
				x=270;
				y=120;
				size1=700;
				size2=380;
				prueba=false;
				break;
			case 2:
				srcName="Imagenes/tapausb.png";
				x=315;
				y=200;
				size1=400;
				size2=255;
				prueba=true;
				je=true;
				break;
			case 3:
				srcName="Imagenes/boton-pinzas.png";
				x=580;
				y=0;
				size1=140;
				size2=85;
				prueba=false;
				break;
				
			case 4:
				srcName="Imagenes/boton-cautin.png";
				x=730;
				y=0;
				size1=140;
				size2=85;
				prueba=false;
				break;
			case 5:
				srcName="Imagenes/boton-brocha.png";
				x=880;
				y=0;
				size1=140;
				size2=85;
				prueba=false;
				break;
				
			case 6:
				srcName="Imagenes/boton-bateria.png";
				x=1030;
				y=0;
				size1=140;
				size2=85;
				prueba=false;
				break;
			case 7:
				srcName="Imagenes/fondousb.png";
				x=0;
				y=0;
				size1=1280;
				size2=720;
				prueba=false;
				break;
			case 8:
				srcName="Imagenes/cablesbase.png";
				x=270;
				y=120;
				size1=700;
				size2=380;
				prueba=false;
				prueba2=false;
				break;
			case 9:
				srcName="Imagenes/bandeja.png";
				x=640;
				y=440;
				size1=540;
				size2=240;
				prueba=false;
				break;
			case 10:
				srcName="Imagenes/cable1.png";
				x=270;
				y=120;
				size1=70;
				size2=25;
				prueba=true;
				prueba2=false;
				break;
			case 11:
				srcName="Imagenes/cable2.png";
				x=350;
				y=120;
				size1=50;
				size2=25;
				prueba=true;
				prueba2=false;
				break;
			case 12:
				srcName="Imagenes/cable3.png";
				x=420;
				y=120;
				size1=115;
				size2=40;
				prueba=true;
				prueba2=false;
				break;
			case 13:
				break;
			case 14:
				break;
			case 15:
				break;
				
		}
		
		File srcFile= new File(srcName);
		try{
			img=ImageIO.read(srcFile);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	
	public boolean isJe() {
		return je;
	}



	public void setJe(boolean je) {
		this.je = je;
	}



	public void paint (Graphics g){
		g.drawImage(img, x, y, size1,size2, null);
	}
	
	public void setDrag(boolean  b){
		isDrag=b;
	}
	public boolean getDrag(){
		return isDrag;
	}
	public BufferedImage getImg() {
		return img;
	}
	public void setImg(BufferedImage img) {
		this.img = img;
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
	public boolean isDrag() {
		return isDrag;
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
	
	public boolean isCable3There(){
		
		if(x>=419 && x<=430 && y>=264 && y<=274){
	//		System.out.println("c3");
			prueba=false;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isCable2There(){
		
		if(x>=572 && x<=582 && y>=293 && y<=303){
	//		System.out.println("c2");
			prueba=false;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isCable1There(){
		
		if(x>=388 && x<=398 && y>=373 && y<=383){
	//		System.out.println("c1");
			prueba=false;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isTapaThere(){
		
		if(x>=310 && x<=320 && y>=190 && y<=210 ){
			return true;
		}
		else{
			return false;
		}
	}

}
