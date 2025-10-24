import java.util.Scanner;

public class NumP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        boolean primo;

        if (n <= 1) {
            primo = false;
        } else if (n == 2 || n == 3 || n == 5 || n == 7) {
            primo = true;
        } else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            primo = false;
        } else {
            primo = true;
        }

        if (primo) {
            System.out.println("El número " + n + " es primo.");
        } else {
            System.out.println("El número " + n + " no es primo.");
        }

        scanner.close();
    }
}