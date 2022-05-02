import java.util.Scanner;

public class EjercicioDos {

    public static int edad;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        edad = capturarDatosDelUsuario();
        evaluarDatosDelUsuario(edad);
    }

    public static int capturarDatosDelUsuario(){
        System.out.println("Cual es tu edad?");
        return input.nextInt();
    }

    public  static void evaluarDatosDelUsuario(int edad){
        if (edad < 18){
            System.out.println("Usted es menor de edad");
        }
    }
}
