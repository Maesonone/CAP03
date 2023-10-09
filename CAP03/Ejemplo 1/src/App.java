import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      System.out.print("Nombre y edad: ");
      String nombre = sc.next();
      int edad = sc.nextInt();
      System.out.println("Su nombre es "+nombre+" y usted tiene "+edad+" años.");
        sc.close();
      
}
}
    
