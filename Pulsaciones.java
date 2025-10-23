import java.util.Scanner;
public class Pulsaciones{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int edad=0, pulsaciones=0, segundos=10;
	System.out.println("Ingresa tu edad");
	edad=sc.nextInt();
	pulsaciones=(220-edad)/10;
	System.out.println("Tu numero de pulsaciones es: "+pulsaciones);
	}
}