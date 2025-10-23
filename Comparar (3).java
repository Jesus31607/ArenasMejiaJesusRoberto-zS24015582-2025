import java.util.Scanner;
public class Comparar{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num1=0,num2=0,num3=0,mayor=0,menor=0;
	double promedio=0;
	
	System.out.println("Ingresa el primer numero");
	num1=sc.nextInt();
	System.out.println("Ingresa el segundo numero");
	num2=sc.nextInt();
	System.out.println("Ingresa el tercer numero");
	num3=sc.nextInt();

	if(num1==num2 && num2==num3){
	System.out.println("Los tres valores son iguales");
	}else{

	if (num1>num2){
		if (num1>num3){
		mayor=num1;
		}
		}else{
		if(num2>num3){
		mayor=num2;
		}else{
		mayor=num3;
		}
	}
		if(num1<num2){
		if(num1<num3){
		menor=num1;
		}else{
	}
		}else{
		if(num2<num3){
		menor=num2;
		}else{
		menor=num3;
         }
       }   
	promedio=(num1+num2+num3)/3;
	System.out.println("El numero mayor es: "+mayor);
	System.out.println("El numero menor es: "+menor);
	System.out.println("El numero promedio es: "+promedio);

    }
  }
}



































