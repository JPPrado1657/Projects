
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class MyCanvas2 extends Canvas  implements MouseMotionListener, MouseListener, ActionListener{ 
private Stereo stereo;
private MouseType mouseType;
private Timer t;
private Timer x;
private boolean click;

public MyCanvas2(){
	super();
	
	t=new Timer (90, this);
	x=new Timer (300, this);
	stereo=new Stereo();
	addMouseListener(this);
	addMouseMotionListener(this);
	t.start();
	mouseType = MouseType.PINZAS;
	try{
		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("Imagenes/mousepinzas.png").getImage(),new Point(0,0),"custom cursor"));
    }catch(Exception ex){}
}
BufferedImage im = new BufferedImage(1280,720, BufferedImage.TYPE_INT_RGB);

public void paint(Graphics g){
	Graphics b = im.createGraphics();
	b.fillRect(0, 0, 1280, 720);
	stereo.paint(b);
	g.drawImage(im, 0, 0, null);
	
}
public void update(Graphics g){
	paint(g);
}


@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	click=true;
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
	Point p = e.getPoint();
	// TODO Auto-generated method stub
	if(mouseType==MouseType.CAUTIN){
		try{
			setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("Imagenes/mouse-cautin2.png").getImage(),new Point(0,0),"custom cursor"));
	    }catch(Exception ex){}
		mouseType=MouseType.CAUTIN_RED;
	}
		switch (mouseType) {
		case PINZAS:
		
//			System.out.println("hola");
			if(stereo.isThereTapa1(p)&& stereo.getTapa1().isPrueba()){
				System.out.println("Hola");
				stereo.getTapa1().setDrag(true);
				
			}
			if(stereo.isThereTapa2(p) && stereo.getTapa2().isPrueba()){
				System.out.println("Hola");
				stereo.getTapa2().setDrag(true);
			}
			if(stereo.isThereBoc2(p)&& stereo.getBoc2().isPrueba()){
				stereo.getBoc2().setDrag(true);
			}
			break;
		case BATERIA:
			
			break;
		case CAUTIN:
		case CAUTIN_RED:
			click=true;
			break;
		case CEPILLO:
//			System.out.println("hola");
			if(stereo.isThereB1(p)){
				
				stereo.getB1().setEliminar(stereo.getB1().getEliminar()+1);
				System.out.println("Eliminando");
			}
			if(stereo.isThereB2(p)){
				stereo.getB2().setEliminar(stereo.getB2().getEliminar()+1);
				System.out.println("Eliminando");
			}
			if(stereo.isThereB3(p)){
				stereo.getB3().setEliminar(stereo.getB3().getEliminar()+1);
				System.out.println("Eliminando");
			}
			if(stereo.isThereB4(p)){
				stereo.getB4().setEliminar(stereo.getB4().getEliminar()+1);
				System.out.println("Eliminando");
			}
			if(stereo.isThereB5(p)){
				stereo.getB5().setEliminar(stereo.getB5().getEliminar()+1);
				System.out.println("Eliminando");
			}
			if(stereo.isThereBicho(p)){
				stereo.getBicho1().setEliminar(stereo.getBicho1().getEliminar()+1);
				System.out.println("Eliminando");
			}	
			
			
			break;
		default:
			break;
		}
		
		
	}
	


@Override
public void mouseReleased(MouseEvent e) {
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
		
		if(stereo.getTapa1().isDrag()){
			stereo.getTapa1().setDrag(false);
			if( e.getX()>= 260 && e.getX()<= (260+stereo.getTapa1().getSize1()) && e.getY()>= 140 && e.getY()<= (140+stereo.getTapa1().getSize2()) && stereo.isLimpia()==false){
				stereo.getTapa1().setPrueba(false);
				stereo.getTapa1().setX(260);
				stereo.getTapa1().setY(140);
				System.out.println("jajajaja");
			}
			
		}
		if(stereo.getTapa2().isDrag()){
			stereo.getTapa2().setDrag(false);
			if( e.getX()>= 240 && e.getX()<= (240+stereo.getTapa2().getSize1()) && e.getY()>= 330 && e.getY()<= (330+stereo.getTapa2().getSize2()) && stereo.isLimpia()==false ){
				stereo.getTapa2().setPrueba(false);
				stereo.getTapa2().setX(240);
				stereo.getTapa2().setY(330);
				System.out.println("jajajaja");
			}
			
		}
		if(stereo.getBoc2().isDrag() ){
			stereo.getBoc2().setDrag(false);
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
	// TODO Auto-generated method stub
	switch(mouseType){
	case PINZAS:
		
		if(stereo.getTapa1().isDrag()){
			stereo.getTapa1().setX(e.getX()-stereo.getTapa1().getSize1()/2);
			stereo.getTapa1().setY(e.getY()-stereo.getTapa1().getSize2()/2);
			System.out.println("SI");
		}
		if(stereo.getTapa2().isDrag()){
			stereo.getTapa2().setX(e.getX()-stereo.getTapa2().getSize1()/2);
			stereo.getTapa2().setY(e.getY()-stereo.getTapa2().getSize2()/2);
		}
		if(stereo.getBoc2().isDrag()){
			stereo.getBoc2().setX(e.getX()-stereo.getBoc2().getSize1()/2);
			stereo.getBoc2().setY(e.getY()-stereo.getBoc2().getSize2()/2);
		}
		break;
	case CAUTIN:
	case CAUTIN_RED:
		if(click==true){
			
			//stereo.getSold().agrega(e.getX(), e.getY());
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource()==x){
	
		
		t.stop();
	}
	if(e.getSource()==t){
		stereo.getBicho1().move();	
	}
	repaint();
}



}
