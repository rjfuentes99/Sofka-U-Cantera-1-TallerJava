import java.util.Scanner;
public class EjercicioTres {
    private static String nombreCompleto;
    private static String nombreMama;
    private static String nombrePapa;
    public static void main(String[] args){
        Scanner String = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre completo?");
        nombreCompleto = String.nextLine();
        System.out.println("Cual es el nombre de tu mama?");
        nombreMama = String.nextLine();
        System.out.println("Cual es el nombre de tu papa");
        nombrePapa = String.nextLine();
        System.out.println("Yo "+nombreCompleto+" Soy hijo de "+nombreMama+" y "+ nombrePapa);

    }
}
