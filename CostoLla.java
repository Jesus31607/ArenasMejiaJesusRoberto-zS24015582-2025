import java.util.Scanner;

public class CostoLla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	int minutos;
	double costo;
        System.out.print("Ingrese la duración de la llamada (en minutos): ");
        minutos = sc.nextInt();

        if (minutos <= 3) {
            costo = 10.0;
        } else {
            costo = 10.0 + (minutos - 3) * 1.0;
        }


        System.out.println("Duración de la llamada: " + minutos + " minutos");
        System.out.println("Costo total a pagar: " + costo);

    }
}
