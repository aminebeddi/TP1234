import java.util.Scanner;

public class tp3ex2{
    public static void main(String[] args) {
        int[] tableau = new int[10];
        Scanner scanner = new Scanner(System.in);

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