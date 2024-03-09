import java.util.Scanner;

public class tp2ex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez N : ");
        int n = scanner.nextInt();

        double somme = 0.0;
        for (int i = 1; i <= n; i++) {
            somme += 1.0 / i;
        }

        System.out.println("Somme : " + somme);

        scanner.close();
    }
}