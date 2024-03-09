import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Scanner;

public class EX2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'heure (de 0 à 23) :");
        int hour = scanner.nextInt();
        System.out.print("Entrez les minutes (de 0 à 59) :");
        int minute = scanner.nextInt();
        scanner.close();

        int nextHour = nextHourAfterMinute(hour, minute);
        int nextMinute = minute + 1;

        printNextTime(nextHour, nextMinute);
    }

    public static int nextHourAfterMinute(int hour, int minute) {
        if (minute + 1 >= 60) {
            return hour + 1;
        } else {
            return hour;
        }
    }

    public static void printNextTime(int hour, int minute) {
        System.out.printf("%dh %d", hour, minute);
        if (minute == 1) {
            System.out.print(" heure";
        } else {
            System.out.print(" heures";
        }
        System.out.println(" 1 plus tard seront " + hour + " heures " + minute + ".");
    }
}
