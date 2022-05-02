import java.util.Scanner;

public class EjercicioCuatro {

    public static int numeroSolicitado;
    public static Scanner String = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        numeroSolicitado = capturarNumeroMultiplicar();
        evaluarNumeroMultiplicado(numeroSolicitado);
    }
    public static int capturarNumeroMultiplicar(){
        System.out.println("ingrese el numero que quiere multiplicar");
        return input.nextInt();
    }
    public static void evaluarNumeroMultiplicado(int numeroSolicitado){
        for (int i =0 ; i <= 10; i++) {
            System.out.println(numeroSolicitado + " * " + i + " = " + (numeroSolicitado* i));
        }
    }
}