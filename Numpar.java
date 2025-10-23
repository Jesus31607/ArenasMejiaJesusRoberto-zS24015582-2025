import java.util.Scanner;
class Numpar{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println( "Ingresa el numero: " );
	int numero=0;
	numero=sc.nextInt( );
	
	if(numero % 2 == 0){
		System.out.println( " El numero: " + numero + " Es par. " );
	}else{
		System.out.println( " El numero: " + numero + " Es impar. " );
	       }
	}
}