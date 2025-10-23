import java.util.Scanner;
public class Area{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double radio,longitud,area,pi=3.1416;

	System.out.println("Ingresa el radio");
	radio=sc.nextDouble();
	longitud = 2 * pi * radio;
	area = pi * radio * radio;
	System.out.println("Longitud: "+longitud);
	System.out.println("Area: "+area);
	}
}