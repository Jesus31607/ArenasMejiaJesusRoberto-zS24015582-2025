import java.util.Scanner;
public class Descuento{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	
	double monto, descuento=0, total;
	
	System.out.println("Ingresa el monto total");
	monto= sc.nextDouble();
	
	if (monto<=500){
	descuento=0;

	}else if (monto>500 && monto <=1000 ){
	descuento=monto*0.05;

	}else if (monto>=7000){
	descuento=monto*0.10;
	}
	
	total= monto-descuento;
	System.out.println("Resultado de la venta");

	System.out.println("Monto original: " + monto);
	System.out.println("Descuento aplicado: " + descuento);
	System.out.println("Total a pagar: " + total);

	}
}
	 