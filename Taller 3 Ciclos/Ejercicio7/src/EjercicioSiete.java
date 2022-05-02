import java.util.Scanner;

public class EjercicioSiete {

    public static String nombrePropetario, nombrePropetario2, nombrePropetario3, nombrePropetario4, nombrePropetario5, numeroPropetario, numeroPropetario2, numeroPropetario3, numeroPropetario4, numeroPropetario5, placaVehiculo, placaVehiculo2,placaVehiculo3, placaVehiculo4, placaVehiculo5, marcaVehiculo, marcaVehiculo2, marcaVehiculo3, marcaVehiculo4, marcaVehiculo5;
    public static int opcion,opcion2,opcion3,opcion4,opcion5;
    public static Scanner lword = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        nombrePropetario = "";
        numeroPropetario = "";
        placaVehiculo = "";
        marcaVehiculo = "";
        nombrePropetario2 = "";
        numeroPropetario2 = "";
        placaVehiculo2 = "";
        marcaVehiculo2 = "";
        nombrePropetario3 = "";
        numeroPropetario3 = "";
        placaVehiculo3 = "";
        marcaVehiculo3 = "";
        nombrePropetario4 = "";
        numeroPropetario4 = "";
        placaVehiculo4 = "";
        marcaVehiculo4 = "";
        nombrePropetario5 = "";
        numeroPropetario5 = "";
        placaVehiculo5 = "";
        marcaVehiculo5 = "";

        do {
            opcion = capturaOpcionMenu();
            evaluarOpcionUsuario(opcion);
        }while (opcion!=4);
    }

    public static int capturaOpcionMenu(){

        System.out.println(" ");
        System.out.println("Bienvenido al parqueadero nocturno El Guardian");
        System.out.println(" ");
        System.out.println("1. Ingresar vehiculo");
        System.out.println("2. Retirar vehiculo");
        System.out.println("3. Consultar existencia de vehiculo");
        System.out.println("4. Salir del sistema");
        System.out.println(" ");

        return input.nextInt();
    }

    public static void evaluarOpcionUsuario(int opcion){
        switch (opcion){
            case 1:
                System.out.println(" ");
                System.out.println("Elija un puesto de estacionamiento");
                System.out.println(" ");
                System.out.println("1. Primer puesto");
                System.out.println("2. Segundo puesto");
                System.out.println("3. Tercer puesto");
                System.out.println("4. Cuarto puesto");
                System.out.println("5. Quinto puesto");
                System.out.println(" ");
                opcion2 = input.nextInt();
                switch (opcion2){
                    case 1:
                        if (nombrePropetario.equals("") || numeroPropetario.equals("") || placaVehiculo.equals("") || marcaVehiculo.equals("")){
                            System.out.println(" ");
                            System.out.println("Parqueadero disponible");
                            System.out.println(" ");
                            System.out.println("Nombre propetario");
                            nombrePropetario = lword.nextLine();
                            System.out.println("Numero telefonico");
                            numeroPropetario = lword.nextLine();
                            System.out.println("Placa vehiculo");
                            placaVehiculo = lword.nextLine();
                            System.out.println("Marca vehiculo");
                            marcaVehiculo = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Vehiculo registrado con exito");
                            System.out.println(" ");
                        }else {
                            System.out.println("Parqueadero no disponible");
                        }
                        break;
                    case 2:
                        if (nombrePropetario2.equals("") || numeroPropetario2.equals("") || placaVehiculo2.equals("") || marcaVehiculo2.equals("")){
                            System.out.println(" ");
                            System.out.println("Parqueadero disponible");
                            System.out.println(" ");
                            System.out.println("Nombre propetario");
                            nombrePropetario2 = lword.nextLine();
                            System.out.println("Numero telefonico");
                            numeroPropetario2 = lword.nextLine();
                            System.out.println("Placa vehiculo");
                            placaVehiculo2 = lword.nextLine();
                            System.out.println("Marca vehiculo");
                            marcaVehiculo2 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Vehiculo registrado con exito");
                            System.out.println(" ");
                        }else {
                            System.out.println("Parqueadero no disponible");
                        }
                        break;
                    case 3:
                        if (nombrePropetario3.equals("") || numeroPropetario3.equals("") || placaVehiculo3.equals("") || marcaVehiculo3.equals("")){
                            System.out.println(" ");
                            System.out.println("Parqueadero disponible");
                            System.out.println(" ");
                            System.out.println("Nombre propetario");
                            nombrePropetario3 = lword.nextLine();
                            System.out.println("Numero telefonico");
                            numeroPropetario3 = lword.nextLine();
                            System.out.println("Placa vehiculo");
                            placaVehiculo3 = lword.nextLine();
                            System.out.println("Marca vehiculo");
                            marcaVehiculo3 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Vehiculo registrado con exito");
                            System.out.println(" ");
                        }else {
                            System.out.println("Parqueadero no disponible");
                        }
                        break;
                    case 4:
                        if (nombrePropetario4.equals("") || numeroPropetario4.equals("") || placaVehiculo4.equals("") || marcaVehiculo4.equals("")){
                            System.out.println(" ");
                            System.out.println("Parqueadero disponible");
                            System.out.println(" ");
                            System.out.println("Nombre propetario");
                            nombrePropetario4 = lword.nextLine();
                            System.out.println("Numero telefonico");
                            numeroPropetario4 = lword.nextLine();
                            System.out.println("Placa vehiculo");
                            placaVehiculo4 = lword.nextLine();
                            System.out.println("Marca vehiculo");
                            marcaVehiculo4 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Vehiculo registrado con exito");
                            System.out.println(" ");
                        }else {
                            System.out.println("Parqueadero no disponible");
                        }
                        break;
                    case 5:
                        if (nombrePropetario5.equals("") || numeroPropetario5.equals("") || placaVehiculo5.equals("") || marcaVehiculo5.equals("")){
                            System.out.println(" ");
                            System.out.println("Parqueadero disponible");
                            System.out.println(" ");
                            System.out.println("Nombre propetario");
                            nombrePropetario5 = lword.nextLine();
                            System.out.println("Numero telefonico");
                            numeroPropetario5 = lword.nextLine();
                            System.out.println("Placa vehiculo");
                            placaVehiculo5 = lword.nextLine();
                            System.out.println("Marca vehiculo");
                            marcaVehiculo5 = lword.nextLine();
                            System.out.println(" ");
                            System.out.println("Vehiculo registrado con exito");
                            System.out.println(" ");
                        }else {
                            System.out.println("Parqueadero no disponible");
                        }
                        break;
                }
                break;
            case 2:
                System.out.println(" ");
                System.out.println("Que vehiculo desea retirar");
                System.out.println(" ");
                System.out.println("1. Primer puesto");
                System.out.println("2. Segundo puesto");
                System.out.println("3. Tercer puesto");
                System.out.println("4. Cuarto puesto");
                System.out.println("5. Quinto puesto");
                System.out.println(" ");
                opcion3 = input.nextInt();
                switch (opcion3){
                    case 1:
                        if (nombrePropetario.equals("") || numeroPropetario.equals("") || placaVehiculo.equals("") || marcaVehiculo.equals("")){
                            System.out.println("No hay ningun vehiculo en este parqueadero");
                        }else {
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo+" "+placaVehiculo+" y su dueño es "+nombrePropetario+" "+numeroPropetario);
                            System.out.println(" ");
                            System.out.println("Desea retirar este vehiculo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                    nombrePropetario = "";
                                    numeroPropetario = "";
                                    placaVehiculo = "";
                                    marcaVehiculo = "";
                                    System.out.println("Acerquese al punto de control con el ticket");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    case 2:
                        if (nombrePropetario2.equals("") || numeroPropetario2.equals("") || placaVehiculo2.equals("") || marcaVehiculo2.equals("")){
                            System.out.println("No hay ningun vehiculo en este parqueadero");
                        }else {
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo2+" "+placaVehiculo2+" y su dueño es "+nombrePropetario2+" "+numeroPropetario2);
                            System.out.println(" ");
                            System.out.println("Desea retirar este vehiculo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                    nombrePropetario2 = "";
                                    numeroPropetario2 = "";
                                    placaVehiculo2 = "";
                                    marcaVehiculo2 = "";
                                    System.out.println("Acerquese al punto de control con el ticket");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    case 3:
                        if (nombrePropetario3.equals("") || numeroPropetario3.equals("") || placaVehiculo3.equals("") || marcaVehiculo3.equals("")){
                            System.out.println("No hay ningun vehiculo en este parqueadero");
                        }else {
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo3+" "+placaVehiculo3+" y su dueño es "+nombrePropetario3+" "+numeroPropetario3);
                            System.out.println(" ");
                            System.out.println("Desea retirar este vehiculo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                    nombrePropetario3 = "";
                                    numeroPropetario3 = "";
                                    placaVehiculo3 = "";
                                    marcaVehiculo3 = "";
                                    System.out.println("Acerquese al punto de control con el ticket");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    case 4:
                        if (nombrePropetario4.equals("") || numeroPropetario4.equals("") || placaVehiculo4.equals("") || marcaVehiculo4.equals("")){
                            System.out.println("No hay ningun vehiculo en este parqueadero");
                        }else {
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo4+" "+placaVehiculo4+" y su dueño es "+nombrePropetario4+" "+numeroPropetario4);
                            System.out.println(" ");
                            System.out.println("Desea retirar este vehiculo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                    nombrePropetario4 = "";
                                    numeroPropetario4 = "";
                                    placaVehiculo4 = "";
                                    marcaVehiculo4 = "";
                                    System.out.println("Acerquese al punto de control con el ticket");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    case 5:
                        if (nombrePropetario5.equals("") || numeroPropetario5.equals("") || placaVehiculo5.equals("") || marcaVehiculo5.equals("")){
                            System.out.println("No hay ningun vehiculo en este parqueadero");
                        }else {
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo5+" "+placaVehiculo5+" y su dueño es "+nombrePropetario5+" "+numeroPropetario5);
                            System.out.println(" ");
                            System.out.println("Desea retirar este vehiculo?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            System.out.println(" ");
                            opcion4 = input.nextInt();
                            switch (opcion4){
                                case 1:
                                    nombrePropetario5 = "";
                                    numeroPropetario5 = "";
                                    placaVehiculo5 = "";
                                    marcaVehiculo5 = "";
                                    System.out.println("Acerquese al punto de control con el ticket");
                                    System.out.println(" ");
                            }
                        }
                        break;
                    }
                break;
            case 3:
                System.out.println("Elija un puesto de estacionamiento");
                System.out.println(" ");
                System.out.println("1. Primer puesto");
                System.out.println("2. Segundo puesto");
                System.out.println("3. Tercer puesto");
                System.out.println("4. Cuarto puesto");
                System.out.println("5. Quinto puesto");
                System.out.println(" ");
                opcion5 = input.nextInt();
                switch (opcion5){
                    case 1:
                        if(marcaVehiculo != "" || placaVehiculo != ""){
                            System.out.println(" ");
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo+" y su placa es "+placaVehiculo);
                        }else {
                            System.out.println(" ");
                            System.out.println("No hay ningun vehiculo en este puesto");
                        }
                        break;
                case 2:
                        if(marcaVehiculo2 != "" || placaVehiculo2 != ""){
                            System.out.println(" ");
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo2+" y su placa es "+placaVehiculo2);
                        }else {
                            System.out.println(" ");
                            System.out.println("No hay ningun vehiculo en este puesto");
                        }
                        break;
                    case 3:
                        if(marcaVehiculo3 != "" || placaVehiculo3 != ""){
                            System.out.println(" ");
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo3+" y su placa es "+placaVehiculo3);
                        }else {
                            System.out.println(" ");
                            System.out.println("No hay ningun vehiculo en este puesto");
                        }
                        break;
                    case 4:
                        if(marcaVehiculo4 != "" || placaVehiculo4 != ""){
                            System.out.println(" ");
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo4+" y su placa es "+placaVehiculo4);
                        }else {
                            System.out.println(" ");
                            System.out.println("No hay ningun vehiculo en este puesto");
                        }
                        break;
                    case 5:
                        if(marcaVehiculo5 != "" || placaVehiculo5 != ""){
                            System.out.println(" ");
                            System.out.println("Este vehiculo se encuentra en este parqueadero");
                            System.out.println(marcaVehiculo5+" y su placa es "+placaVehiculo5);
                        }else {
                            System.out.println(" ");
                            System.out.println("No hay ningun vehiculo en este puesto");
                        }
                        break;
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Coloque una opcion entre la 1 y 3");
        }
    }
}
