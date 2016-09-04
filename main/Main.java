/* Téllez Ponce Juan Daniel
 * App Mobiles
 * Tarea #03: Numeros complejos
 */

package main;
import complex_ug.Complex;
public class Main {
	
	public static void main(String[] args) {
		//Variables de entrada
		Complex complejo1 = new Complex(2,2);
		Complex complejo2 = new Complex(5,10);
		Complex complejo3 = new Complex(0,0);
		
		//Llamando funciones e imprimir
		complejo3.sum(complejo1, complejo2);
		System.out.println("Suma de Imaginarios - Real: " + complejo3.getReal() + " Img: " + complejo3.getImg());
	
		complejo3.Res(complejo2, complejo1);
		System.out.println("Resta de Imaginarios - Real: " + complejo3.getReal() + " Img: " + complejo3.getImg());
		
		complejo3.Mult(complejo2, complejo1);
		System.out.println("Multiplicacion Imaginarios - Real: " + complejo3.getReal() + " Img: " + complejo3.getImg());
	}
}
