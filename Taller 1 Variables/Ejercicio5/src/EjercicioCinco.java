import java.util.Scanner;
public class EjercicioCinco {
    private static String nombreDueño;
    private static String nombreMascota;
    private static int edadMascota;
    private static String tipoMascota;
    public static void main(String[] args){
        Scanner String = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        nombreDueño = String.nextLine();
        System.out.println("Cual es el nombre de tu mascota?");
        nombreMascota = String.nextLine();
        System.out.println("Cual es la edad de tu mascota?");
        edadMascota = input.nextInt();
        System.out.println("Que tipo de animal es tu mascota?");
        tipoMascota = String.nextLine();
        System.out.println(nombreMascota+" Es un(a) "+tipoMascota+" ,el cual, tiene, "+edadMascota+" años de edad y "+nombreDueño+" Es actualmente su dueño");
    }
}
