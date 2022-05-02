import java.util.Scanner;

public class ejercicioSeis {

    public static String nombreUsuario1,nombreUsuario2,nombreUsuario3, organizacion1,organizacion2,organizacion3,telefono1,telefono2,telefono3;
    public static int opcion,opcion2;
    public static Scanner lword = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        nombreUsuario1 =  "";
        nombreUsuario2 = "";
        nombreUsuario3 = "";
        organizacion1 = "";
        organizacion2 = "";
        organizacion3 = "";
        telefono1 = "";
        telefono2 = "";
        telefono3 = "";

        do {
            opcion = capturaOpcionMenu();
            evaluarOpcionUsuario(opcion);
        }while (opcion!=4);
    }

    public static int capturaOpcionMenu(){

        System.out.println("Menu de usuario");
        System.out.println("1. Escribe 3 contactos");
        System.out.println("2. Buscar contacto almacenados");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Salir del sistema");

        return input.nextInt();
    }

    public static void evaluarOpcionUsuario(int opcion){

        switch (opcion){
            case 1:
                System.out.println(" ");
                System.out.println("Ingrese los datos del primer contacto");
                System.out.println("Cual es el nombre");
                nombreUsuario1 = lword.nextLine();
                System.out.println("Cual es el numero telefonico");
                telefono1 = lword.nextLine();
                System.out.println("En donde trabaja?");
                organizacion1 = lword.nextLine();
                System.out.println(" ");
                System.out.println("Contacto 1 Registrado");
                System.out.println(" ");

                System.out.println("Ingrese los datos del segundo contacto");
                System.out.println("Cual es el nombre");
                nombreUsuario2 = lword.nextLine();
                System.out.println("Cual es el numero telefonico");
                telefono2 = lword.nextLine();
                System.out.println("En donde trabaja?");
                organizacion2 = lword.nextLine();
                System.out.println(" ");
                System.out.println("Contacto 2 Registrado");
                System.out.println(" ");

                System.out.println("Ingrese los datos del tercer contacto");
                System.out.println("Cual es el nombre");
                nombreUsuario3 = lword.nextLine();
                System.out.println("Cual es el numero telefonico");
                telefono3 = lword.nextLine();
                System.out.println("En donde trabaja?");
                organizacion3 = lword.nextLine();
                System.out.println(" ");
                System.out.println("Contacto 3 Registrado");
                System.out.println(" ");
                System.out.println("Todos los contactos registrados");
                break;
            case 2:
                System.out.println(" ");
                System.out.println("Contactos registrados");
                System.out.println(" ");
                if (nombreUsuario1 != " " || telefono1 != " " || organizacion1 != " "){
                    System.out.println("Contacto 1 "+nombreUsuario1+" Telefono:"+telefono1+" Organizacion "+organizacion1);
                }else{
                    System.out.println("Contacto 1 no registrado");
                }
                System.out.println(" ");
                if (nombreUsuario2 != " " || telefono2 != " " || organizacion2 != " "){
                    System.out.println("Contacto 2 "+nombreUsuario2+" Telefono:"+telefono2+" Organizacion "+organizacion2);
                }else{
                    System.out.println("Contacto 2 no registrado");
                }
                System.out.println(" ");
                if (nombreUsuario2 != " " || telefono3 != " " || organizacion3 != " "){
                    System.out.println("Contacto 3 "+nombreUsuario3+" Telefono:"+telefono3+" Organizacion "+organizacion3);
                }else{
                    System.out.println("Contacto 3 no registrado");
                }
                System.out.println(" ");
                break;
            case 3:
                System.out.println(" ");
                System.out.println("Que contacto desea eliminar?");
                System.out.println(" ");
                System.out.println("1. Contacto 1");
                System.out.println("2. Contacto 2");
                System.out.println("3. Contacto 3");
                System.out.println(" ");
                opcion2 = input.nextInt();
                System.out.println(" ");
                switch (opcion2){
                    case 1:
                        nombreUsuario1 = "";
                        organizacion1 = "";
                        telefono1 = "";
                        System.out.println("Contacto 1 Eliminado");
                        System.out.println(" ");
                        break;
                    case 2:
                        nombreUsuario2 = "";
                        organizacion2 = "";
                        telefono2 = "";
                        System.out.println("Contacto 2 Eliminado");
                        System.out.println(" ");
                        break;
                    case 3:
                        nombreUsuario3 = "";
                        organizacion3 = "";
                        telefono3 = "";
                        System.out.println("Contacto 3 Eliminado");
                        System.out.println(" ");
                        break;
                }
                break;
            case 4:
                System.out.println("Hasta luego");
                break;
        }
    }
}