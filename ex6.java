import java.util.Scanner;

public class ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'a' : ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of 'b' : ");
        double b = scanner.nextDouble();

        double d = b * b - 4 * a * 0;

        int s;
        if (d > 0) {
            s = 2;
        } else if (d == 0) {
            s = 1;
        } else {
            s = 0;
        }

        System.out.println("There are " + s + " solution" + (s > 1 ? "s" : "") + " :");

        if (s > 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("There is no real solution.");
        }

        scanner.close();
    }
}