import java.util.Scanner;
public class Conversion{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double metros,pies,pulgadas;
	System.out.println("\tCONVERSION DE MEDIDAS");
	System.out.println("Ingresa la medida en metros que deseas convertir");
	metros=sc.nextDouble();
	pies = metros * 3.28084;
	pulgadas = metros * 39.3701;
	System.out.println("De metros a pies equivale a: " + pies);	
	System.out.println("De metros a pulgadas equivale a: " + pulgadas);
	}
}