import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le rayon du cercle : ");
        double rayon = scanner.nextDouble();

        double perimetre = 2 * Math.PI * rayon;
        double surface = Math.PI * Math.pow(rayon, 2);

        System.out.println("Le périmètre du cercle est : " + perimetre);
        System.out.println("La surface du cercle est : " + surface);

        scanner.close();
    }
}
