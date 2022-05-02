import java.util.Scanner;
public class EjercicioCuatro {
    private static String pais;
    private static String capital;
    public static void main(String[] args){
        Scanner String = new Scanner(System.in);
        System.out.println("En que pais vive?");
        pais = String.nextLine();
        System.out.println("Cual es la ciudad capital del pais donde vive?");
        capital = String.nextLine();
        System.out.println("La ciudad "+capital+" Es la capital de "+pais);
    }
}
