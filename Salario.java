import java.util.Scanner;
public class Salario{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double salarioAnt=0,salarioAu=0;
	System.out.println("Ingresa tu salario anterior");
	salarioAnt=sc.nextDouble();
	salarioAu=salarioAnt*.25;
	System.out.println("Tu salario con aumento es: "+salarioAu);
	}
}