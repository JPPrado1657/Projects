

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class MyCanvas extends Canvas implements MouseMotionListener, MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usb usb;
	private MouseType mouseType;
	private boolean click;
	
	public MyCanvas(){
	super();
		click=false;
		usb=new Usb();
		addMouseListener(this);
		addMouseMotionListener(this);
		mouseType = MouseType.PINZAS;
		try{
			setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("Imagenes/mousepinzas.png").getImage(),new Point(0,0),"custom cursor"));
	    }catch(Exception ex){}
	}

	BufferedImage im = new BufferedImage(1280,720, BufferedImage.TYPE_INT_RGB);
	
	public void paint(Graphics g){
		Graphics b = im.createGraphics();
		b.fillRect(0, 0, 1280, 720);
		
		
		Usb aux=(Usb)usb;
		aux.paint(b);
		g.drawImage(im, 0, 0, null);
	}
	
	public void update(Graphics g){
		paint(g);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		click=true;
	//	System.out.print("click");
		if(e.getX()>=730 && e.getX()<=730+140 && e.getY()>=0 && e.getY()<=85){//Boton Cautin
			try{
				setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("Imagenes/Cautin.png").getImage(),new Point(0,0),"custom cursor"));
		    }catch(Exception ex){}
			
			mouseType= MouseType.CAUTIN;
			}
			if(e.getX()>=580 && e.getX()<=580+140 && e.getY()>=0 && e.getY()<=85){//Boton Pinzas
				try{
					setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("Imagenes/mousepinzas.png").getImage(),new Point(0,0),"custom cursor"));
				}catch(Exception ex){}
		
			mouseType= MouseType.PINZAS;
			}
			if(e.getX()>=880 && e.getX()<=880+140 && e.getY()>=0 && e.getY()<=85){//Boton Pinzas
				try{
					setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("Imagenes/brocha.png").getImage(),new Point(0,0),"custom cursor"));
			    }catch(Exception ex){}
	
			mouseType= MouseType.CEPILLO;
			}
			
			
			
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(mouseType==MouseType.CAUTIN){
			try{
				setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("Imagenes/mouse-cautin2.png").getImage(),new Point(0,0),"custom cursor"));
		    }catch(Exception ex){}
			mouseType=MouseType.CAUTIN_RED;
		}
		
		switch (mouseType) {
		case PINZAS:
			Usb aux=(Usb)usb;
			Point p = e.getPoint();
			if(aux.isThere(p)){
				
				aux.getTapa().setDrag(true);
			}
			if(aux.isTherec1(p)&& aux.getC1().isPrueba()==true){
				
				aux.getC1().setDrag(true);
			}
			if(aux.isTherec2(p)&& aux.getC2().isPrueba()==true){
				
				aux.getC2().setDrag(true);
			}
			if(aux.isTherec3(p)&& aux.getC3().isPrueba()==true){
				
				aux.getC3().setDrag(true);
			}
			break;
		case BATERIA:
			
			break;
		case CAUTIN:
		case CAUTIN_RED:
			click=true;
			break;
		case CEPILLO:
			break;
		default:
			break;
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x;
		int y;
		if(mouseType==MouseType.CAUTIN_RED){
			try{
				setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("Imagenes/Cautin.png").getImage(),new Point(0,0),"custom cursor"));
		    }catch(Exception ex){}
			mouseType=MouseType.CAUTIN;
		}
		switch(mouseType){
		case PINZAS:
			Usb aux=(Usb)usb;
			if(aux.getTapa().getDrag()){
				aux.getTapa().setDrag(false);
				aux.getTapa().setJe(false);
			}
			if(aux.getC1().getDrag()){
				aux.getC1().setDrag(false);
				x=aux.getC1().getX();
				y=aux.getC1().getY();
				System.out.println("\nC1 x: "+x+" y: "+y);
			}
			if(aux.getC2().getDrag()){
				aux.getC2().setDrag(false);
				x=aux.getC2().getX();
				y=aux.getC2().getY();
				System.out.println("\nC2 x: "+x+" y: "+y);
			}
			if(aux.getC3().getDrag()){
				aux.getC3().setDrag(false);
				x=aux.getC3().getX();
				y=aux.getC3().getY();
				System.out.println("\nC3 x: "+x+" y: "+y);
			}
			break;
		case CAUTIN:
		case CAUTIN_RED:
			click=false;
			break;
			
		}
		
	
		repaint();
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		switch(mouseType){
		case PINZAS:
			Usb aux=(Usb)usb;
			if(aux.getTapa().getDrag()){
				aux.getTapa().setX(e.getX()-aux.getTapa().getSize1()/2);
				aux.getTapa().setY(e.getY()-aux.getTapa().getSize2()/2);
			}
			if(aux.getC1().getDrag()){
				aux.getC1().setX(e.getX()-aux.getC1().getSize1()/2);
				aux.getC1().setY(e.getY()-aux.getC1().getSize2()/2);
			}
			if(aux.getC2().getDrag()){
				aux.getC2().setX(e.getX()-aux.getC2().getSize1()/2);
				aux.getC2().setY(e.getY()-aux.getC2().getSize2()/2);
			}
			if(aux.getC3().getDrag()){
				aux.getC3().setX(e.getX()-aux.getC3().getSize1()/2);
				aux.getC3().setY(e.getY()-aux.getC3().getSize2()/2);
			}
			break;
		case CAUTIN:
		case CAUTIN_RED:
			if(click==true){
				Usb aux1=(Usb)usb;
				aux1.getSold().agrega(e.getX(), e.getY());
				repaint();
				System.out.print("Soldando");
			}
			break;
			
		}
	
		repaint();
		
		
		
		
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	public Usb getUsb() {
		return usb;
	}

	public void setUsb(Usb usb) {
		this.usb = usb;
	}

	public MouseType getMouseType() {
		return mouseType;
	}

	public void setMouseType(MouseType mouseType) {
		this.mouseType = mouseType;
	}

	public boolean isClick() {
		return click;
	}

	public void setClick(boolean click) {
		this.click = click;
	}
	
	

}
