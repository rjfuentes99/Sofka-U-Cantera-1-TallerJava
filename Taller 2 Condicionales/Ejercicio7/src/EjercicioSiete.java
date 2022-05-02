import java.util.Scanner;

public class EjercicioSiete {

    public static String nombre;
    public static int peso, opcion;
    public static double IMC, estatura;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        opcion = colocarDatosPersonales();
        evaluarDatosPersonales(opcion);
    }

    public static int colocarDatosPersonales(){
        System.out.println("Porfavor coloque su nombre");
        nombre = String.nextLine();
        System.out.println("Bienvenido "+nombre +" al ministerio de salud");
        System.out.println("Te haremos una encuesta para saber tu indice de masa corporal o IMC");
        System.out.println("Coloque su altura en mts");
        estatura = input.nextDouble();
        System.out.println("Coloque su peso en kg");
        peso = input.nextInt();
        System.out.println(nombre+" Usted pesa: "+peso+" y mide: "+estatura+" Correcto?");
        System.out.println("1. Si");
        System.out.println("2. No");
        return input.nextInt();
    }

    public static void evaluarDatosPersonales(int opcion){
        switch (opcion){
            case 1:
                IMC = peso/(estatura*estatura);
                System.out.println("Su IMC es de:"+IMC);
                if (IMC <= 18.5){
                    System.out.println("Usted tiene un peso bajo");
                }else if(IMC >= 18.6 && IMC <= 24.9){
                    System.out.println("Usted tiene un peso normal");
                }else if(IMC >= 25 && IMC <= 29.9){
                    System.out.println("Usted tiene sobrepeso");
                }else if(IMC >= 30){
                    System.out.println("Usted sofre de obesidad");
                }
            break;
            case 2:
                System.out.println(nombre+" Reinicie la pagina e ingrese bien sus datos");
            break;
            default:
                System.out.println("Reinicie la pagina y coloque bien los datos");
        }
    }
}

