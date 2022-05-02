import java.util.Scanner;

public class EjercicioSeis {

    public static String ingresoMoto, observacionesMoto, nombreVehiculo, arreglosmoto, nuevasPiezas;
    public static int opcion, opcion2,opcion3;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        opcion = opcionMenuPrincipal();
        evaluarOpcionMenuPrincipal(opcion);

    }

    public static int opcionMenuPrincipal(){

        System.out.println("Bienvenido(a)s al taller de motos El maquinista") ;
        System.out.println("1. Ingresar moto al sistema") ;
        System.out.println("2. Retirar moto del sistema") ;
        return input.nextInt();

    }

    public static void evaluarOpcionMenuPrincipal(int opcion){

        switch (opcion){
            case 1:
                System.out.println("Ingrese el tipo de la moto");
                ingresoMoto = String.nextLine();
                System.out.println("Que observaciones le ves el cliente a la moto a la hora de su ingreso");
                observacionesMoto = String.nextLine();
                System.out.println("Entonces usted ingresa una "+ ingresoMoto+" ,con las siguientes observaciones: "+observacionesMoto+" Correcto?");
                System.out.println("1.Si");
                System.out.println("2.No");
                opcion2 = input.nextInt();
                switch (opcion2){
                    case 1:
                        System.out.println("Registro exitoso del vehiculo");
                        break;
                    case 2:
                        System.out.println("Reinicie la aplicacion y vuelva a ingresar los datos");
                        break;
                    default:
                        System.out.println("Coloque la opcion entre la 1 y 2");
                }
                break;
            case 2:
                System.out.println("Ingrese el nombre especifico del vehiculo");
                nombreVehiculo = String.nextLine();
                System.out.println("Desea agregar que arreglos se le hizo al vehiculo");
                System.out.println("1.Si");
                System.out.println("2.No");
                opcion3 = input.nextInt();
                switch (opcion3){
                    case 1:
                        System.out.println("Escriba que arreglos le realizo al vehiculo");
                        arreglosmoto = String.nextLine();
                        System.out.println("Agregue que piezas le cambio al vehiculo");
                        nuevasPiezas = String.nextLine();
                        System.out.println("A la moto "+nombreVehiculo+" se le hizo los siguientes arreglos "+arreglosmoto+" y se le cambio las siguientes piezas "+nuevasPiezas);
                        System.out.println("El vehiculo sera retirado del sistema y entregado al dueño");
                    break;
                    case 2:
                        System.out.println("El mecanico no especifica que arreglos se le hizo al propetario");
                    break;
                    default:
                    System.out.println("Coloque la opcion entre la 1 y 2");
            }
            break;
            default:
                System.out.println("Coloque la opcion entre la 1 y 2");
        }
    }
}

