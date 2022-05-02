import java.util.Scanner;

public class EjercicioCinco {

    public static String articuloDevolver, numeroPastillas,numeroBlisters;
    public static int opcion,opcion2,opcion3;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        opcion = opcionMenuPrincipal();
        evaluarOpcionPrincipal(opcion);
    }

    public static int opcionMenuPrincipal(){

        System.out.println("Bienvenido a la farmacia virtual");
        System.out.println("===========================================");
        System.out.println("1. Comprar producto");
        System.out.println("2. Devoluciones");
        return input.nextInt();

    }

    public static void evaluarOpcionPrincipal(int opcion){
        switch (opcion){
            case 1:
                System.out.println("Seleccione el producto que quiera comprar");
                System.out.println("1. Paracetamol de 400mg");
                System.out.println("2. Paracetamol de 600mg");
                System.out.println("3. Paracetamol de 800mg");
                System.out.println("Consultar precios de:");
                opcion2 = input.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.println("Precios");
                        System.out.println("1. La pildora cuesta 10 centavos");
                        System.out.println("2. El blister cuesta 2 dolares");
                        opcion3 = input.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("Cuantas pildoras quieres comprar?");
                                numeroPastillas = String.nextLine();
                                System.out.println("Tu pedido esta listo para recojer");
                                break;
                            case 2:
                                System.out.println("Cuantos blisters quieres comprar?");
                                numeroBlisters = String.nextLine();
                                System.out.println("Tu pedido esta listo para recojer");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Precios");
                        System.out.println("1. La pildora cuesta 15 centavos");
                        System.out.println("2. El blister cuesta 2.5 dolares");
                        opcion3 = input.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("Cuantas pildoras quieres comprar?");
                                numeroPastillas = String.nextLine();
                                System.out.println("Tu pedido esta listo para recojer");
                                break;
                            case 2:
                                System.out.println("Cuantos blisters quieres comprar?");
                                numeroBlisters = String.nextLine();
                                System.out.println("Tu pedido esta listo para recojer");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Precios");
                        System.out.println("1. La pildora cuesta 20 centavos");
                        System.out.println("2. El blister cuesta 3 dolares");
                        opcion3 = input.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("Cuantas pildoras quieres comprar?");
                                numeroPastillas = String.nextLine();
                                System.out.println("Tu pedido esta listo para recojer");
                                break;
                            case 2:
                                System.out.println("Cuantos blisters quieres comprar?");
                                numeroBlisters = String.nextLine();
                                System.out.println("Tu pedido esta listo para recojer");
                                break;
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("Que articulo quiere devolver");
                articuloDevolver = String.next();
                System.out.println("Acerquese a la farmacia con el "+articuloDevolver);
                break;
        }
    }
}
