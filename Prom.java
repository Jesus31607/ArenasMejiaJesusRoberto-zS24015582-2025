import java.util.Scanner;
public class Prom{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double nota1,nota2,nota3,promedio;
	System.out.println("Ingresa las calificion de la primera nota");
	nota1=sc.nextDouble();
	System.out.println("Ingresa las calificion de la segunda nota");
	nota2=sc.nextDouble();
	System.out.println("Ingresa las calificion de la tercera nota");
	nota3=sc.nextDouble();
	promedio=(nota1+nota2+nota3)/3;
	System.out.println("El promedio es: "+promedio);
	}
}
