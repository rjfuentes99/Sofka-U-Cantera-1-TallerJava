import java.util.Scanner;

public class ejercicioUno {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int[] num = new int[5];
        for (int i=0; i<5; i++){
            System.out.println("Ingrese un numero para el "+i);
            num[i] = input.nextInt();
        }
        System.out.println(" ");
        for (int i=0;i<5;i++){
            System.out.println("["+i+"] "+num[i]);
        }
    }
}

