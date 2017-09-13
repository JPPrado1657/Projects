import java.awt.Graphics;
import java.awt.Point;

public class Usb {
	
	private Imagen cablesbase;
	private Imagen c1;
	private Imagen c2;
	private Imagen c3;
	private boolean weld1;
	private boolean weld2;
	private boolean dust1;
	private boolean cover;
	private int op;
	private Imagen tapa;
	private Imagen base;
	private Imagen pinzas;
	private Imagen cautin;
	private Imagen brocha;
	private Imagen bateria;
	private Imagen fondo;
	private Bolitas sol;
	private soldadura sold;
	private Imagen bandeja;
	private int p;
	private boolean condicion_cables;
	private Imagen b1;
	private Imagen b2;
	private Imagen b3;
	private Imagen b4;
	private Imagen b5;
	private boolean fin=false;
	
	public Usb(){
		super();
		op=1;
		weld1=true;
		weld2=true;
		dust1=true;
		cover=true;
		base=new Imagen(1);
		tapa=new Imagen(2);
		pinzas=new Imagen(3);
		cautin=new Imagen(4);
		brocha=new Imagen(5);
		bateria=new Imagen(6);
		fondo=new Imagen(7);
		sold=new soldadura();
		bandeja=new Imagen(9);
		p=0;
		cablesbase = new Imagen(8);
		c1= new Imagen(10);
		c2 = new Imagen (11);
		c3 = new Imagen (12);
		condicion_cables=true;
		b1=new Imagen (13);
		b2=new Imagen (13);
		b3=new Imagen (13);
		b4=new Imagen (14);
		b5=new Imagen (14);
	}
	
	

	public Imagen getCablesbase() {
		return cablesbase;
	}



	public void setCablesbase(Imagen cablesbase) {
		this.cablesbase = cablesbase;
	}



	public Imagen getC1() {
		return c1;
	}



	public void setC1(Imagen c1) {
		this.c1 = c1;
	}



	public Imagen getC2() {
		return c2;
	}



	public void setC2(Imagen c2) {
		this.c2 = c2;
	}



	public Imagen getC3() {
		return c3;
	}



	public void setC3(Imagen c3) {
		this.c3 = c3;
	}



	public Imagen getBandeja() {
		return bandeja;
	}



	public void setBandeja(Imagen bandeja) {
		this.bandeja = bandeja;
	}



	public int getP() {
		return p;
	}



	public void setP(int p) {
		this.p = p;
	}



	public boolean isCondicion_cables() {
		return condicion_cables;
	}



	public void setCondicion_cables(boolean condicion_cables) {
		this.condicion_cables = condicion_cables;
	}



	public Imagen getB1() {
		return b1;
	}



	public void setB1(Imagen b1) {
		this.b1 = b1;
	}



	public Imagen getB2() {
		return b2;
	}



	public void setB2(Imagen b2) {
		this.b2 = b2;
	}



	public Imagen getB3() {
		return b3;
	}



	public void setB3(Imagen b3) {
		this.b3 = b3;
	}



	public Imagen getB4() {
		return b4;
	}



	public void setB4(Imagen b4) {
		this.b4 = b4;
	}



	public Imagen getB5() {
		return b5;
	}



	public void setB5(Imagen b5) {
		this.b5 = b5;
	}



	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public Imagen getBase() {
		return base;
	}

	public void setBase(Imagen base) {
		this.base = base;
	}

	public Imagen getPinzas() {
		return pinzas;
	}

	public void setPinzas(Imagen pinzas) {
		this.pinzas = pinzas;
	}

	public Imagen getCautin() {
		return cautin;
	}

	public void setCautin(Imagen cautin) {
		this.cautin = cautin;
	}

	public Imagen getBrocha() {
		return brocha;
	}

	public void setBrocha(Imagen brocha) {
		this.brocha = brocha;
	}

	public Imagen getBateria() {
		return bateria;
	}

	public void setBateria(Imagen bateria) {
		this.bateria = bateria;
	}

	public Imagen getFondo() {
		return fondo;
	}

	public void setFondo(Imagen fondo) {
		this.fondo = fondo;
	}

	public Bolitas getSol() {
		return sol;
	}

	public void setSol(Bolitas sol) {
		this.sol = sol;
	}

	public soldadura getSold() {
		return sold;
	}

	public void setSold(soldadura sold) {
		this.sold = sold;
	}

	public boolean isCover() {
		return cover;
	}

	public void setTapa(Imagen tapa) {
		this.tapa = tapa;
	}

	public boolean getWeld1() {
		return weld1;
	}

	public void setWeld1(boolean weld1) {
		this.weld1 = weld1;
	}

	public boolean getWeld2() {
		return weld2;
	}

	public void setWeld2(boolean weld2) {
		this.weld2 = weld2;
	}

	public boolean getDust1() {
		return dust1;
	}

	public void setDust1(boolean dust1) {
		this.dust1 = dust1;
	}

	public Imagen getTapa() {
		return tapa;
	}

	public void setCover(boolean cover) {
		this.cover = cover;
	}
	
	
	public void paint(Graphics g) {

		boolean cabl1=c1.isCable1There();
		boolean cabl2=c2.isCable2There();
		boolean cabl3=c3.isCable3There();
		if(tapa.getDrag()==false){
			if(tapa.getX()>=bandeja.getX() && tapa.getX()<=bandeja.getX()+bandeja.getSize1() && tapa.getY()>= bandeja.getY() && tapa.getY()<=bandeja.getY()+bandeja.getSize2()){
				p=1;
				fondo.paint(g);
				base.paint(g);
				if(condicion_cables==true){
					cablesbase.paint(g);
					c1.paint(g);
					c2.paint(g);
					c3.paint(g);
				}
				sold.paint(g);
				pinzas.paint(g);
				cautin.paint(g);
				brocha.paint(g);
				bateria.paint(g);
			}

			if(sold.soldado() && cabl1 && cabl2 && cabl3){
				p=0;
			}
			if(sold.soldado() && cabl1 && cabl2 && cabl3 && tapa.isTapaThere()){
				fin=true;
			}
			fondo.paint(g);
			base.paint(g);

			if(condicion_cables==true){
				cablesbase.paint(g);
				
				if(	tapa.isJe()==false){
				c1.paint(g);
				c2.paint(g);
				c3.paint(g);
				}
			}
			sold.paint(g);
			if(p==0){
				tapa.paint(g);	
			}
			pinzas.paint(g);
			cautin.paint(g);
			brocha.paint(g);
			bateria.paint(g);
		}
		else{
			if(tapa.getX()>=bandeja.getX() && tapa.getX()<=bandeja.getX()+bandeja.getSize1() && tapa.getY()>= bandeja.getY() && tapa.getY()<=bandeja.getY()+bandeja.getSize2()){
				p=1;
				fondo.paint(g);
				base.paint(g);
				if(condicion_cables==true){
					cablesbase.paint(g);
					c1.paint(g);
					c2.paint(g);
					c3.paint(g);
				}
				sold.paint(g);
				pinzas.paint(g);
				cautin.paint(g);
				brocha.paint(g);
				bateria.paint(g);
			}
			else{
				fondo.paint(g);
				base.paint(g);
				bandeja.paint(g);
				if(condicion_cables==true){
					cablesbase.paint(g);
					c1.paint(g);
					c2.paint(g);
					c3.paint(g);
				}
				sold.paint(g);
				if(p==0){
					tapa.paint(g);
				}
				pinzas.paint(g);
				cautin.paint(g);
				brocha.paint(g);
				bateria.paint(g);
			}
		}

	}

	public boolean isThere(Point e) {
		return e.getX()>=(getTapa().getX()) && e.getX()<=(getTapa().getX()+(getTapa().getSize1())) && e.getY()>=(getTapa().getY())&& e.getY()<=(getTapa().getY()+(getTapa().getSize2()));
	}
	
	public boolean isTherec1(Point e){
		return e.getX()>=(getC1().getX()) && e.getX()<=(getC1().getX()+(getC1().getSize1())) && e.getY()>=(getC1().getY()) && e.getY()<=(getC1().getY()+(getC1().getSize2()));
	}
	public boolean isTherec2(Point e){
		return e.getX()>=(getC2().getX()) && e.getX()<=(getC2().getX()+(getC2().getSize1())) && e.getY()>=(getC2().getY()) && e.getY()<=(getC2().getY()+(getC2().getSize2()));
	}
	public boolean isTherec3(Point e){
		return e.getX()>=(getC3().getX()) && e.getX()<=(getC3().getX()+(getC3().getSize1())) && e.getY()>=(getC3().getY()) && e.getY()<=(getC3().getY()+(getC3().getSize2()));
	}



	public boolean isFin() {
		return fin;
	}



	public void setFin(boolean fin) {
		this.fin = fin;
	}
	
	
}
