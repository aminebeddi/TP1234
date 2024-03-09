import java.util.Scanner;

public class ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de x : ");
        double x = scanner.nextDouble();

        System.out.print("Entrez la valeur de n (entier) : ");
        int n = scanner.nextInt();

        double result = pow(x, n);

        System.out.printf("x^n =", result);

        scanner.close();
    }
}