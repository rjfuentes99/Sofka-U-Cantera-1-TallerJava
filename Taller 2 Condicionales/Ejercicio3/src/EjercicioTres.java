import java.util.Scanner;

public class EjercicioTres {

    public static int edad;
    public static String nombreCompleto;
    public static Scanner input = new Scanner(System.in);
    public static Scanner String = new Scanner(System.in);

    public static void main(String[] args) {
        nombreCompleto = capturarDatosDelUsuario1();
        edad = capturarDatosDelUsuario2();
        evaluarDatosDelUsuario(edad);
    }

    public static String capturarDatosDelUsuario1(){
        System.out.println("Cual es tu nombre?");
        return String.nextLine();
    }

    public static int capturarDatosDelUsuario2(){
        System.out.println("Que edad tienes?");
        return input.nextInt();
    }

    public static void evaluarDatosDelUsuario(int edad){
        if (edad >= 18) {
            System.out.println(nombreCompleto + " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }else{
            System.out.println(nombreCompleto+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}

