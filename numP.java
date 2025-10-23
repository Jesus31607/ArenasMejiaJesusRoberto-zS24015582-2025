import java.util.Scanner;
public class numP{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int numN,contador=0,i;
	System.out.println("ingrese un valor");
	numN=sc.nextInt();

	if(numN <= 1){
	System.out.println("El numero ingresado: " + numN+ " no es primo");
	}else{
	for(i=1; i<=numN; i++){
	if(numN % i ==0){
	contador++;
	if(contador==2)
	System.out.println("EL numero ingresado: "+numN + " Es primo");
	}else{ 
	System.out.println("El numero ingresado: "+numN + " No es primo");
}
}
	}	
}
}