import java.util.Scanner;

public class dowhile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez N : ");
        int n = scanner.nextInt();

        int somme = 0;
        int produit = 1;
        int nombre;
        int i = 0;

        do {
            System.out.print("Entrez un nombre : ");
            nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            i++;
        } while (i < n);

        double moyenne = (double) somme / n;

        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);

        scanner.close();
    }
}