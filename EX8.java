import java.util.Scanner;

public class EX8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez l'âge : ");
        int age = scanner.nextInt();
        
        System.out.print("Entrez le sexe (M ou F) : ");
        char sexe = scanner.next().charAt(0);
        
        if ((sexe == 'M' && age > 20) || (sexe == 'F' && age >= 18 && age <= 35)) {
            System.out.println("Imposable");
        } else {
            System.out.println("Non imposable");
        }
        
        scanner.close();
    }
}