import java.util.Scanner;

public class tp2ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez X : ");
        int x = scanner.nextInt();
        System.out.print("Entrez N : ");
        int n = scanner.nextInt();

        int resultat = 1;
        for (int i = 0; i < n; i++) {
            resultat *= x;
        }

        System.out.println("Résultat : " + resultat);

        scanner.close();
    }
}
