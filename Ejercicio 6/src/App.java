import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del triángulo: ");
        int a = sc.nextInt();
        System.out.print("Introduzca la altura del triángulo: ");
        int b = sc.nextInt();
        System.out.println("El área del triángulo es de "+(a*b)/2+" unidades cuadradas.");
        sc.close();
    }
}
