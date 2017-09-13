import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class Stereo {
	
private Imagen2 fondo;
private Imagen2 boc1;
private Imagen2 boc2;
private Imagen2 tapa1;
private Imagen2 tapa2;
private Imagen2 basebocina;
private Imagen pinzas;
private Imagen cautin;
private Imagen brocha;
private Imagen bateria;
private Imagen2 b1;
private Imagen2 b2;
private Imagen2 b3;
private Imagen2 b4;
private Imagen2 b5;
private Imagen bandeja;
private int p;
private boolean limpia;
private Imagen2 bicho1;
private Imagen2 bicho2;
private Imagen2 bicho3;
private Imagen2 bicho4;
private Imagen2 intro;

public Imagen2 getBicho1() {
	return bicho1;
}


public void setBicho1(Imagen2 bicho1) {
	this.bicho1 = bicho1;
}


public Stereo(){

	bandeja=new Imagen(9);
	fondo=new Imagen2(1);
	boc1=new Imagen2(2);
	boc2=new Imagen2(3);
	basebocina=new Imagen2(4);
	tapa1=new Imagen2(5);
	tapa2=new Imagen2(6);
	pinzas=new Imagen(3);
	cautin=new Imagen(4);
	brocha=new Imagen(5);
	bateria=new Imagen(6);
	b1=new Imagen2 (7, 270, 150);
	b2=new Imagen2 (7, 280, 430);
	b3=new Imagen2 (7, 260, 370);
	b4=new Imagen2 (8, 335, 195);
	b5=new Imagen2 (8, 340, 380);
	p=0;
	limpia=true;
	bicho1=new Imagen2(9, 510,170);
	intro = new Imagen2(17);
}





public Imagen2 getBicho2() {
	return bicho2;
}


public void setBicho2(Imagen2 bicho2) {
	this.bicho2 = bicho2;
}


public Imagen2 getBicho3() {
	return bicho3;
}


public void setBicho3(Imagen2 bicho3) {
	this.bicho3 = bicho3;
}


public Imagen2 getBicho4() {
	return bicho4;
}


public void setBicho4(Imagen2 bicho4) {
	this.bicho4 = bicho4;
}


public Imagen2 getIntro() {
	return intro;
}


public void setIntro(Imagen2 intro) {
	this.intro = intro;
}


public int getP() {
	return p;
}


public void setP(int p) {
	this.p = p;
}


public boolean isLimpia() {
	return limpia;
}


public void setLimpia(boolean limpia) {
	this.limpia = limpia;
}


public Imagen getBandeja() {
	return bandeja;
}


public void setBandeja(Imagen bandeja) {
	this.bandeja = bandeja;
}


public void paint(Graphics g){
	
	
	
	fondo.paint(g);
	boc1.paint(g);
	basebocina.paint(g);

	
	
	if(b1.getEliminar()<3){
	b1.paint(g);}
	if(b2.getEliminar()<3){
	b2.paint(g);}
	if(b3.getEliminar()<3){
	b3.paint(g);}
	if(b4.getEliminar()<5){
	b4.paint(g);}
	if(b5.getEliminar()<5){
	b5.paint(g);}
	if(b1.getEliminar()>=3 && b2.getEliminar()>=3 && b3.getEliminar()>=3 && b4.getEliminar()>=5 && b5.getEliminar()>=5){
		limpia=false;
	}
	if(b1.getEliminar()>=3 && b2.getEliminar()>=3 && b3.getEliminar()>=3 && b4.getEliminar()>=5 && b5.getEliminar()>=5 && getTapa1().isPrueba()==false   && getTapa2().isPrueba()==false){
		boc2.setPrueba(true);
		
		if(bicho1.getEliminar()<5){
		bicho1.paint(g);
		}
	}
	
	
	tapa1.paint(g);
	tapa2.paint(g);
	pinzas.paint(g);
	cautin.paint(g);
	brocha.paint(g);
	bateria.paint(g);
	boc2.paint(g);
	

		intro.paint(g);
	
	
}

public boolean isThereTapa1 (Point p){
	return p.getX()>=tapa1.getX() && p.getX()<=(tapa1.getX()+tapa1.getSize1()) && p.getY()>=tapa1.getY() && p.getY()<=(tapa1.getY()+tapa1.getSize2());
}
public boolean isThereTapa2 (Point p){
	return p.getX()>=tapa2.getX() && p.getX()<=tapa2.getX()+tapa2.getSize1() && p.getY()>=tapa2.getY() && p.getY()<=(tapa2.getY()+tapa2.getSize2());
}

public boolean isThereBoc2 (Point p){
	return p.getX()>=boc2.getX() && p.getX()<=boc2.getX()+boc2.getSize1() && p.getY()>=boc2.getY() && p.getY()<=boc2.getY()+boc2.getSize2();
}

public boolean isThereB1 (Point p){
	return p.getX()>=b1.getX() && p.getX()<=(b1.getX()+b1.getSize1()) && p.getY()>=b1.getY() && p.getY()<=(b1.getY()+b1.getSize2());
}
public boolean isThereB2 (Point p){
	return p.getX()>=b2.getX() && p.getX()<=(b2.getX()+b2.getSize1()) && p.getY()>=b2.getY() && p.getY()<=(b2.getY()+b2.getSize2());
}
public boolean isThereB3 (Point p){
	return p.getX()>=b3.getX() && p.getX()<=(b3.getX()+b3.getSize1()) && p.getY()>=b3.getY() && p.getY()<=(b3.getY()+b3.getSize2());
}
public boolean isThereB4 (Point p){
	return p.getX()>=b4.getX() && p.getX()<=(b4.getX()+b4.getSize1()) && p.getY()>=b4.getY() && p.getY()<=(b4.getY()+b4.getSize2());
}
public boolean isThereB5 (Point p){
	return p.getX()>=b5.getX() && p.getX()<=(b5.getX()+b5.getSize1()) && p.getY()>=b5.getY() && p.getY()<=(b5.getY()+b5.getSize2());
}
public boolean isThereBicho (Point p){
	return p.getX()>=bicho1.getX() && p.getX()<=(bicho1.getX()+bicho1.getSize1()) && p.getY()>=bicho1.getY() && p.getY()<=(bicho1.getY()+bicho1.getSize2());
}

public Imagen2 getB1() {
	return b1;
}


public void setB1(Imagen2 b1) {
	this.b1 = b1;
}


public Imagen2 getB2() {
	return b2;
}


public void setB2(Imagen2 b2) {
	this.b2 = b2;
}


public Imagen2 getB3() {
	return b3;
}


public void setB3(Imagen2 b3) {
	this.b3 = b3;
}


public Imagen2 getB4() {
	return b4;
}


public void setB4(Imagen2 b4) {
	this.b4 = b4;
}


public Imagen2 getB5() {
	return b5;
}


public void setB5(Imagen2 b5) {
	this.b5 = b5;
}


public Imagen2 getFondo() {
	return fondo;
}


public void setFondo(Imagen2 fondo) {
	this.fondo = fondo;
}


public Imagen2 getBoc1() {
	return boc1;
}


public void setBoc1(Imagen2 boc1) {
	this.boc1 = boc1;
}


public Imagen2 getBoc2() {
	return boc2;
}


public void setBoc2(Imagen2 boc2) {
	this.boc2 = boc2;
}


public Imagen2 getTapa1() {
	return tapa1;
}


public void setTapa1(Imagen2 tapa1) {
	this.tapa1 = tapa1;
}


public Imagen2 getTapa2() {
	return tapa2;
}


public void setTapa2(Imagen2 tapa2) {
	this.tapa2 = tapa2;
}


public Imagen2 getBasebocina() {
	return basebocina;
}


public void setBasebocina(Imagen2 basebocina) {
	this.basebocina = basebocina;
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

}