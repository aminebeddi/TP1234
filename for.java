import java.util.Scanner;

public class for{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez N : ");
        int n = scanner.nextInt();

        int somme = 0;
        int produit = 1;
        int nombre;

        for (int i = 0; i < n; i++) {
            System.out.print("Entrez un nombre : ");
            nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
        }

        double moyenne = (double) somme / n;

        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);

        scanner.close();
    }
}