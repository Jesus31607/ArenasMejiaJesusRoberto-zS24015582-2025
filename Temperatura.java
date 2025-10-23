import java.util.Scanner;
public class Temperatura{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);	
	int gradosC=0,gradosF=0;
	double tempA=273.15;
	System.out.println("Ingresa la temperatura que deseas convertir en grados Fahrenheit y Temperatura absoluta");
	gradosC=sc.nextInt();
	gradosF=(gradosC * 9 / 5) +32;
	tempA=gradosC+tempA;
	System.out.println("La temperatura de grados centigrados a Fahrenheit es: " +gradosF);
	System.out.println("La temperatura de grados centigrados a temperatura absoluta es: "+tempA);

	}
}