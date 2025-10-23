import java.util.Scanner;
class BancoI{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	double capital=0, ganancia=2, total=0;
	System.out.println( "Ingresa la cantidad que deseas invertir: " );
	capital= sc.nextDouble( );
	ganancia= (capital * 2) / 100;
	System.out.println( " Tu inversion es de: " + capital +  "\n Tu ganancia del mes del 2% es: " + ganancia );
	}
}