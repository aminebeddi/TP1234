import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("La factorielle d'un nombre négatif n'est pas définie.");
        } else {
            long factorielle = fact(n);
            System.out.println("La factorielle de " + n + " est : " + factorielle);
        }
    }

    private static long fact(int n) {
        long x = 1;
        
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        
        return x;
    }
}