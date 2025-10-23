import java.util.Scanner;
public class CalculoS {
    public static void main(String[] args) {
	       Scanner entrada = new Scanner(System.in);
        int categoria;
        double horasT,tarifaH=0,salarioB,descuentoS,subsidio=1000,salarioN,subsidioP=0.15,saludP=0.072;
     
        System.out.print("Ingrese la categoría del empleado (1 a 4): ");
        categoria = entrada.nextInt();

        System.out.print("Ingrese el número de horas trabajadas: ");
        horasT = entrada.nextDouble();

        switch (categoria) {
            case 1:
                tarifaH = 20000;
                break;
            case 2:
                tarifaH = 15000;
                break;
            case 3:
                tarifaH = 10000;
                break;
            case 4:
                tarifaH = 7500;
                break;
            default:
                System.out.println("Opcion no valida, elige del 1 al 4");
        }
        salarioB = horasT * tarifaH;
        descuentoS = salarioB * saludP ;

        if (salarioB < subsidioP) {
            subsidio = salarioB * subsidioP;
        }

        salarioN = salarioB - descuentoS + subsidio;

        System.out.println("\n--- Pago a realizar al empleado ---");
        System.out.println("Categoría: " + categoria);
        System.out.println("Horas trabajadas: " + horasT);
        System.out.println("Tarifa por hora: $" + tarifaH);
        System.out.println("Salario bruto: $" + salarioB);
        System.out.println("Descuento de salud(7.2%): $"+ descuentoS);
        System.out.println("Subsidio: $" + subsidio);
        System.out.println("Salario neto a pagar: $" + salarioN);
    }
}