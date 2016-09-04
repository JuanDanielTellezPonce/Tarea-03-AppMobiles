/* Téllez Ponce Juan Daniel
 * App Mobiles
 * Tarea #03: Numeros complejos
 */

package complex_ug;

public class Complex {
	//parte real y parte imaginaria
	private double real;
	private double img;
	
	public Complex() {
		
	}
	
	public Complex(double r, double i){
		this.real=r;
		this.img=i;
	}
	
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImg() {
		return img;
	}
	public void setImg(double img) {
		this.img = img;
	}
	
	//Suma
	public void sum(Complex a, Complex b){
		this.real = a.getReal() + b.getReal();
		this.img = a.getImg() + b.getImg();
	}
	
	//Resta
	public void Res(Complex x, Complex y){
		this.real = x.getReal() - y.getReal();
		this.img = x.getImg() - y.getImg();
	}
	
	//Producto
	public void Mult(Complex c1, Complex c2){
	     this.real = c1.getReal()* c2.getReal() - c1.getImg() * c2.getImg();
	     this.img = c1.getReal() * c2.getImg() + c1.getImg() * c2.getReal();
	  }
	
}
