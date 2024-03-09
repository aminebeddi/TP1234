import java.util.Scanner;

public class tp3ex6{
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

        int[] tableauPositif = new int[n];
        int[] tableauNegatif = new int[n];
        int taillePositif = 0;
        int tailleNegatif = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > 0) {
                tableauPositif[taillePositif] = tableau[i];
                taillePositif++;
            } else if (tableau[i] < 0) {
                tableauNegatif[tailleNegatif] = tableau[i];
                tailleNegatif++;
            }
        }

        System.out.println("Tableau positif :");
        for (int i = 0; i < taillePositif; i++) {
            System.out.println("Élément " + i + " : " + tableauPositif[i]);
        }

        System.out.println("Tableau négatif :");
        for (int i = 0; i < tailleNegatif; i++) {
            System.out.println("Élément " + i + " : " + tableauNegatif[i]);
        }

        scanner.close();
    }
}