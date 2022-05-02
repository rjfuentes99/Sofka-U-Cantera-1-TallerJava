import java.util.Scanner;

public class EjercicioCinco {

    public static String capturarNombre;
    public static int opcion;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        do {
            opcion = CapturaOpcionMenu();
            evaluarOpcionUsuario(opcion);
        }while (opcion!=3);
    }

    public static int CapturaOpcionMenu(){
        System.out.println("Menu de usuario");
        System.out.println("1. Captura nombre");
        System.out.println("2. Saludar persona");
        System.out.println("3. Salir del sistema");
        return input.nextInt();
    }

    public static void evaluarOpcionUsuario(int opcion){
            switch (opcion){
                case 1:
                    System.out.println("Coloque un nombre");
                    capturarNombre = String.nextLine();
                    break;
                case 2:
                    System.out.println("Hola "+capturarNombre);
                    break;
                case 3:
                    System.out.println("Gracias por usar esta aplicacion hasta luego");
                    break;
            }
    }
}
