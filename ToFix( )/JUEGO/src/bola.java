import java.awt.Graphics;

public class bola {

	private Imagenes imagen;
	private Imagenes imagen1;
	private Imagenes imagen2;
	private int x;
	private int y;
	
	public bola(int x, int y){
		
		this.y=y;
		this.x=x;
		imagen=new Imagenes(x,y);
		imagen1=new Imagenes(x+5,y+5);
		imagen2=new Imagenes(x-5,y-5);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Imagenes getImagen() {
		return imagen;
	}
	
	
	
	public void setImagen(Imagenes imagen) {
		this.imagen = imagen;
	}
	
	
	
	public Imagenes getImagen1() {
		return imagen1;
	}
	
	
	
	public void setImagen1(Imagenes imagen1) {
		this.imagen1 = imagen1;
	}
	
	
	
	public Imagenes getImagen2() {
		return imagen2;
	}
	
	
	
	public void setImagen2(Imagenes imagen2) {
		this.imagen2 = imagen2;
	}
	
	
	
	public void paint(Graphics g){
		imagen.paint(g);
		imagen1.paint(g);
		imagen2.paint(g);
	
	}

}