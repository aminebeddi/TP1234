import java.util.Scanner;

public class tp3ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            n = scanner.nextInt();
        } while (n < 10 || n > 50);

        int[] tableau = new int[n];
        int tailleFinale = 0;

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrez un nombre pour la case " + i + " : ");
            tableau[i] = scanner.nextInt();
            if (tableau[i] != 5) {
                tailleFinale++;
            }
        }

        int[] tableauFinal = new int[tailleFinale];
        int j = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] != 5) {
                tableauFinal[j] = tableau[i];
                j++;
            }
        }

        System.out.println("Tableau final :");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Élément " + i + " : " + tableauFinal[i]);
        }

        scanner.close();
    }
}