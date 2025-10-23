import java.util.Scanner; 
 public class VehiculosC{
  public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  double ve1=0,ve2=0,ve3=0,ve4=0,co1=0,co2=0,co3=0,co4=0,total=0;
   System.out.println("ingresa el valor de la primera venta");
   ve1=sc.nextDouble();
   if(ve1 <= 10000000){ 
    co1= ve1*.02; 
   }else if(ve1 > 10000000 && ve1 < 15000000){
    co1= ve1*.04;
   } else {
    co1= ve1*.10;
  }
	System.out.printf("Comision de tu primera ventas es: "+ "%.2f", + co1);
  System.out.println("\ningresa el valor de la segunda venta");
   ve2=sc.nextDouble();
  if(ve2<= 10000000){
     co2=ve2*.02;
      }else if(ve1 > 10000000 && ve1 < 15000000){
    co2=ve2*.04;
   } else{
    co2=ve2*.10;
  }
	System.out.printf("Comision de tu primera ventas es: "+ "%.2f", + co2);
   System.out.println("\nIngresa el valor de la tercera venta"); 
   ve3=sc.nextDouble();
   if(ve3<= 10000000){
     co3=ve3*.02;
      }else if(ve1 > 10000000 && ve1 < 15000000){
    co3=ve3*.04;
   } else{
    co3=ve3*.10;
   }
	System.out.printf("Comision de tu primera ventas es: "+ "%.2f", + co3);
    System.out.println("\ningresa el valor de la cuarta venta"); 
    ve4=sc.nextDouble();
 if(ve4<= 10000000){
     co4=ve4*.02;
      }else if(ve1 > 10000000 && ve1 < 15000000){
    co4=ve4*.04;
   } else{
    co4=ve4*.10;
   }
	System.out.printf("Comision de tu primera ventas es: "+ "%.2f", + co4);
 total=co1+co2+co3+co4;

     System.out.printf("\nEl total de las comisiones ganadas es :" + "%.2f", + total);
  }
 }
 

 
