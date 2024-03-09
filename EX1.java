import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier positif :");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
        } else {
            divisorsInfo(n);
        }
        scanner.close();
    }

    public static void divisorsInfo(int n) {
        Set<Integer> divisors = new HashSet<>();
        int countDivisors = 0;
        int sumDivisors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                sumDivisors += i;
                countDivisors++;
            }
        }

        System.out.println("Les diviseurs de " + n + " sont : " + divisors);
        System.out.println("Le nombre de diviseurs de " + n + " est : " + countDivisors);
        System.out.println("La somme de ces diviseurs est : " + sumDivisors);
    }
}