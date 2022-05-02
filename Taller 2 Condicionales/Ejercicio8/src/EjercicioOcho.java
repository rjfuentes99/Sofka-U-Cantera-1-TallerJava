import java.util.Scanner;
public class EjercicioOcho {
    public static String sabor,decoraciones,pedidoTorta,porciones;
    public static int opcion,opcion2,costoTorta;
    private static Scanner String = new Scanner(System.in);
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        opcion = opcionMenuPrincipal();
        evaluarOpcionMenuPrincipal(opcion);
    }

    public static int opcionMenuPrincipal(){
        System.out.println("Pasteleria Don Carlos");
        System.out.println("1. Registrar pedido");
        System.out.println("2. Tortas disponibles para venta");
        System.out.println("3. Ventas diarias");
        return input.nextInt();
    }

    public static void evaluarOpcionMenuPrincipal(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Registrar una torta");
                System.out.println("De que sabor es la torta");
                sabor = String.nextLine();
                System.out.println("De cuantas porciones desea el cliente?");
                porciones = String.nextLine();
                System.out.println("Que decoracion desea el cliente?");
                decoraciones = String.nextLine();
                System.out.println("El cliente pidio una torta de: " + sabor + " de " + porciones + " porciones y con la siguiente decoracion: " + decoraciones + " Correcto?");
                System.out.println("1. Si");
                System.out.println("2. No");
                opcion2 = input.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.println("El pedido fue registrado");
                        break;
                    case 2:
                        System.out.println("Vuelva al inicio y verifique los datos");
                        break;
                }
                break;
            case 2:
                System.out.println("Pastel numero 1 con sabor ***** y decoraciones ****");
                System.out.println("Pastel numero 2 con sabor ***** y decoraciones ****");
                System.out.println("Pastel numero 3 con sabor ***** y decoraciones ****");
                break;
            case 3:
                System.out.println("Registre el pedido ya entregado");
                pedidoTorta = String.nextLine();
                System.out.println("Cuanto fue la entrada del pedido");
                costoTorta = input.nextInt();
                System.out.println("Se añade al registro diario de venta: " + pedidoTorta + " la cual fue cobrada por " + costoTorta);
                break;
            default:
                System.out.println("Introduzca la opcion correcta entre el 1 y el 3");
        }
    }
}



