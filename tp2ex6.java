import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean estPremier = true;
            if (i < 2) {
                estPremier = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        estPremier = false;
                        break;
                    }
                }
            }

            if (estPremier) {
                System.out.println(i + " est un nombre premier");
            }
        }

        scanner.close();
    }
}

