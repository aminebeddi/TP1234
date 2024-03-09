import java.util.Scanner;

public class EX4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int n = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int m = scanner.nextInt();
        scanner.close();

        boolean areFriendNumbers = isFriendNumber(n, m);

        if (areFriendNumbers) {
            System.out.printf("%d and %d are friend numbers.", n, m);
        } else {
            System.out.printf("%d and %d are not friend numbers.", n, m);
        }
    }

    public static boolean isFriendNumber(int n, int m) {
        if (n <= 1 || m <= 1) {
            return false;
        }

        int sumOfDivisorsN = sumOfDivisors(n);
        int sumOfDivisorsM = sumOfDivisors(m);

        return sumOfDivisorsN == m && sumOfDivisorsM == n;
    }

    private static int sumOfDivisors(int number) {
        int sum = 0;
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }
        return sum;
    }
}