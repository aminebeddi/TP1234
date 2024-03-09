import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la valeur de a : ");
        int a = scanner.nextInt();
        System.out.print("Entrez la valeur de b : ");
        int b = scanner.nextInt();
        
        int x = a;
        a = b;
        b = x;
        
        System.out.println("les mouvelles valeurs sont :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}
