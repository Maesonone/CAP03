import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el primer número: ");
    int a = sc.nextInt();
    System.out.print("Introduzca el segundo número: ");
    int b = sc.nextInt();
    System.out.println("La suma de "+a+" y "+b+" es: "+(a+b));
    System.out.println("La resta de "+a+" y "+b+" es: "+(a-b));
    System.out.println("La multiplicación de "+a+" y "+b+" es: "+(a*b));
    System.out.println("La división de "+a+" y "+b+" es: "+(a/b));
    sc.close();
}
}
