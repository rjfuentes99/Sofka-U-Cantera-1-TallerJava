import java.util.Scanner;

public class EjercicioCuatro {

    public static String nombreRetiro;
    public static String direccion;
    public static String nombrePelicula;
    public static String informePelicula;
    public static int opcion,opcion2,opcion3,opcion4;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        opcion = opcionMenuPrincipal();
        evaluarMenuPrincipal(opcion);
    }

    public static int opcionMenuPrincipal(){
        System.out.println("Bienvenido a la tienda de peliculas virtual");
        System.out.println("===========================================");
        System.out.println("1. Peliculas Disponibles");
        System.out.println("2. Alquilar Peliculas");
        System.out.println("3. Devolver Pelicula");
        return input.nextInt();
    }

    public static void evaluarMenuPrincipal(int opcion){
        switch (opcion){

            case 1:
                System.out.println("Pelicula 1");
                System.out.println("Pelicula 2");
                System.out.println("Pelicula 3");
                break;
            case 2:
                System.out.println("Que pelicula desea alquilar?");
                System.out.println("1.Pelicula 1");
                System.out.println("2.Pelicula 2");
                System.out.println("3.Pelicula 3");
                System.out.println("Coloque el numero de la pelicula");
                opcion2 = input.nextInt();
                System.out.println("Como quieres que sea el retiro");
                System.out.println("1. Retirar en el local");
                System.out.println("2. Enviar a una direccion");
                opcion3 = input.nextInt();
                switch (opcion3){
                    case 1:
                        System.out.println("Ingrese un nombre para retirar el pedido");
                        nombreRetiro = String.nextLine();
                        System.out.println("Su pedido esta listo para retirar bajo el nombre de "+nombreRetiro);
                        break;
                    case 2:
                        System.out.println("Ingrese la direccion para el envio");
                        direccion = String.nextLine();
                        System.out.println("El pedido sera enviado a esta direccion "+direccion);
                        break;
                }
                break;
            case 3:
                System.out.println("Ingrese el nombre de la pelicula que desea devolver");
                nombrePelicula = String.nextLine();
                System.out.println("La pelicula "+nombrePelicula+" Tuvo algun daño o novedad");
                System.out.println("1. Informar sobre daño o novedad");
                System.out.println("2. No hay nada que informar");
                opcion4 = input.nextInt();
                switch (opcion4){
                    case 1:
                        System.out.println("Cual es el daño o novedad presentada?");
                        informePelicula = String.nextLine();
                        System.out.println("Muchas gracias por la informacion brindada, tendremos mas cuidado la proxima vez");
                        break;
                    case 2:
                        System.out.println("Esperamos que hayas disfrutado la pelicula");
                        break;
                }
                break;
        }
    }
}

