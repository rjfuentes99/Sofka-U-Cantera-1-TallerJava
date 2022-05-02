import java.util.Scanner;

public class ejercicioDos {

    public static String espacios,asteriscos;
    public static int valorARepetir, contador, i;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        contador = 0;
        i = 0;
        System.out.println("Escriba las veces que quiera repetir (escriba 10)");
        valorARepetir = input.nextInt();
        evaluarElValoraRepetir(valorARepetir);
    }
    public static void evaluarElValoraRepetir(int valorARepetir){
        while (contador <= valorARepetir){
            espacios = " ";
            asteriscos = "*";
            i = 0;
            while (i < valorARepetir - contador){
                espacios = espacios + " ";
                i = i + 1;
            }
            i = 0;
            while ( i < contador){
                asteriscos = asteriscos +  "*";
                i = i + 1;
            }
            System.out.println(espacios+asteriscos);
            contador = contador + 1;
        }
    }
}



