import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;

public class soldadura {
	
	private ArrayList <bola> bolas;
	private bola b;
	private boolean a=false,g=false,c=false,d=false,e=false,f=false;
	
	public soldadura(){
		bolas=new ArrayList<bola>();
		
	}
	
	public ArrayList<bola> getBolas() {
		return bolas;
	}
	
	public void setBolas(ArrayList<bola> bolas) {
		this.bolas = bolas;
	}
	
	public bola getB() {
		return b;
	}
	
	public void setB(bola b) {
		this.b = b;
	}
	public void paint (Graphics g){
		bola aux;
		ListIterator<bola>itr=bolas.listIterator();
		while(itr.hasNext()){
			 aux = (bola) itr.next();
			aux.paint(g);
		}
	}
	
	public void agrega(int x, int y){
		b=new bola(x,y);
		bolas.add(b);
		
	}
	
	public boolean soldado(){
	
		int j=0;
		bola aux;
		ListIterator<bola>itr=bolas.listIterator();
		
		while(itr.hasNext()){
			aux= (bola) itr.next();
			if(aux.getX()>=415 && aux.getX()<=415+16 && aux.getY()>=289 && aux.getY()<=289+17){
				a=true;
				j++;
			}
			if(aux.getX()>=521 && aux.getX()<=521+18 && aux.getY()>=267 && aux.getY()<=267+14){
				g=true;
				j++;
			}
			if(aux.getX()>=387 && aux.getX()<=387+18 && aux.getY()>=389 && aux.getY()<=389+7){
				c=true;
				j++;
			}
			if(aux.getX()>=573 && aux.getX()<=573+7 && aux.getY()>=309 && aux.getY()<=309+11){
				d=true;
				j++;
			}
			if(aux.getX()>=615 && aux.getX()<=615+17 && aux.getY()>=293 && aux.getY()<=293+14){
				e=true;
				j++;
			}
			if(aux.getX()>=438 && aux.getX()<=438+14 && aux.getY()>=377 && aux.getY()<=377+13){
				f=true;
				j++;
			}
		}
		
	//	if( j>=6 ){
	//		return true;
	//	}
		if(a && c && d && e && f && g){
			return true;
		}
		else{
			return false;
		}
	}

}

