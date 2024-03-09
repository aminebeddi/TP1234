import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int premierEntier = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int deuxiemeEntier = scanner.nextInt();

        scanner.close();

        int somme = premierEntier + deuxiemeEntier;
        System.out.println("Somme : " + somme);

        int difference = premierEntier - deuxiemeEntier;
        System.out.println("Différence : " + difference);

        int produit = premierEntier * deuxiemeEntier;
        System.out.println("Produit : " + produit);

        int quotient = premierEntier / deuxiemeEntier;
        if (deuxiemeEntier == 0) {
            System.out.println("Quotient (si deuxième entier n'est pas zéro) :");
        } else {
            System.out.println("Quotient : " + quotient);
        }
    }
}