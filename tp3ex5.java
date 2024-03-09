import java.util.Scanner;

public class tp3ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Entrez la taille du tableau : ");
        n = scanner.nextInt();

        int[] tableau = new int[n];

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrez un nombre pour la case " + i + " : ");
            tableau[i] = scanner.nextInt();
        }

        System.out.println("Tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + i + " : " + tableau[i]);
        }

        System.out.println("Tableau inversé :");
        for (int i = tableau.length - 1; i >= 0; i--) {
            System.out.println("Élément " + i + " : " + tableau[i]);
        }

        scanner.close();
    }
}
