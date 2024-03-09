import java.util.Scanner;

public class EX3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer greater than 1: ");
        int n = scanner.nextInt();
        scanner.close();

        boolean isPerfectNumber = isPerfect(n);

        if (isPerfectNumber) {
            System.out.printf("%d is a perfect number.", n);
        } else {
            System.out.printf("%d is not a perfect number.", n);
        }
    }