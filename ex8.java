import java.util.Scanner;

public class ex8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = scanner.nextInt();

        System.out.print("Enter b : ");
        int b = scanner.nextInt();

        int x = pgcd(a, b);

        System.out.println("PGCD est" + x );

        scanner.close();
    }

    private static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return pgcd(b, a % b);
    }
}