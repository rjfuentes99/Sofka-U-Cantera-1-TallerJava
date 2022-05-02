import java.util.Scanner;
public class EjercicioDos {
    private static String nombre1;
    private static String apellido1;
    private static int edad1;
    private static Double altura1;
    public static void main(String[] args){
        Scanner String = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        nombre1 = String.nextLine();
        System.out.println("Cual es tu apellido?");
        apellido1 = String.nextLine();
        System.out.println("Cual es tu altura?");
        altura1 = input.nextDouble();
        System.out.println("Que edad tienes?");
        edad1 = input.nextInt();
    }
}
