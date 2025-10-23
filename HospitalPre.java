import java.util.Scanner;
public class HospitalPre{
	public static void main(String []args){
	Scanner sc= new Scanner(System.in);
	int area;
	double ginecologia=0,traumatologia=0,pediatria=0,presupuesto=0;
	System.out.println("Ingresa el presupuesto que has obtenido: ");
	presupuesto=sc.nextDouble();

	ginecologia=(presupuesto*0.40);
	traumatologia=(presupuesto*0.30);
	pediatria=(presupuesto*0.30);
	
	System.out.println("El presupuesto anual de ginecologia es: "+ginecologia);
	System.out.println("El presupuesto anual de traumatologia es: "+traumatologia);
	System.out.println("El presupuesto anual de pediatria es: "+pediatria);

	}
}