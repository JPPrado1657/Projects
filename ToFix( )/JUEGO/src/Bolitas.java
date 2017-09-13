import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;

public class Bolitas {
	
	Ball bolita;
	private ArrayList<Ball> bolitas;
	
	public Bolitas(){
		bolitas=new ArrayList<Ball>();
		bolita=new Ball();
		bolitas.add(bolita);	
	}
	public void agregaBolitas(){
		bolita=new Ball();
		bolitas.add(bolita);
		
	}
	public void quitaBolitas(){
		ListIterator <Ball> itr=bolitas.listIterator();
		boolean b=true;
		while (itr.hasNext()&& b){
		b=false;
			itr.next();
			itr.remove();
		}
		
	}
	public void paint (Graphics g){
		Ball aux;
		ListIterator <Ball> itr=bolitas.listIterator();
		
		while(itr.hasNext()){
			aux= (Ball) itr.next();
			aux.paint(g);
			
		}
	}
	
}
