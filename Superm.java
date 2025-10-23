import java.util.Scanner;
class Superm{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	double descuento=0, num, cT, cF;
	System.out.print("Ingresa un numero aleatorio: ");
        	num = sc.nextInt();
	System.out.print("Ingresa el monto de tu compra final: ");
        	cT = sc.nextInt();
		if(num<74){
		descuento= cT*0.15;
		}else{
		if(num>=74){
		descuento= cT*0.20;
		}
		}
	cF=(cT- descuento);
	System.out.println( "Tu numero elegido es: " + num );
	System.out.println( "Tu descuento es: " + descuento );
	System.out.println( "El costo final de tu compra es: " + cF );
	}
}