import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del rectángulo: ");
        int a = sc.nextInt();
        System.out.print("Introduzca la altura del rectángulo: ");
        int b = sc.nextInt();
        System.out.println("El área del rectángulo es de "+(a*b)+" unidades cuadradas.");
        sc.close();
    }
}
