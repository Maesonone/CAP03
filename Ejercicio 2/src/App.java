import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de euros: ");
    int a = sc.nextInt();
    System.out.printf("%d %s %.2f %s", a, " euros son" , a*166.4, "pesetas");
    }
}
