import java.util.Scanner;

public class tp3ex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            n = scanner.nextInt();
        } while (n < 10 || n > 50);

        int[] tableau = new int[n];

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrez un nombre pour la case " + i + " : ");
            tableau[i] = scanner.nextInt();
        }

        System.out.println("Tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + i + " : " + tableau[i]);
        }

        scanner.close();
    }
}