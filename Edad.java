import java.util.Scanner;
public class Edad{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int edad=0,añoN=0;
	System.out.println("Ingresa año en el que estas actualmente");
	edad=sc.nextInt();
	System.out.println("Ingresa tu año de nacimiento");
	añoN=sc.nextInt();
	edad=edad-añoN;
	System.out.println("Tu edad es: "+edad);
	}
}

