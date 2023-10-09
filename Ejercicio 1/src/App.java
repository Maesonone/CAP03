import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int a = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int b = sc.nextInt();
        System.out.println("El producto de "+a+" y "+b+" es: "+(a*b));
        sc.close();
    }
}
