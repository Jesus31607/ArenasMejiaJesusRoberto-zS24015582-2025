import java.util.Scanner;
public class Maestro{
	public static void main(String argS[]){
	Scanner sc=new Scanner(System.in);

	int hombres=0,mujeres=0;
	double porcentajeH,porcentajeM,total=0;
	System.out.println("Ingtresa el numero de alumnos-hombres");
	hombres=sc.nextInt();
	System.out.println("Ingresa el nuumero de alumnas-mujeres");
	mujeres=sc.nextInt();
	total = hombres + mujeres;

	porcentajeH=(hombres/total)*100;
	porcentajeM=(mujeres/total)*100;
	System.out.printf("El porcentaje de los hombres es: "+ "%.2f", +porcentajeH);
	System.out.printf("\nEl porcentaje de las mujeres es: " + "%.2f", +porcentajeM);
	}
}