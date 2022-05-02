import java.util.Scanner;

public class ejercicioCinco {

    public static int columna, columna2, columnausuario, fila, fila2, filausuario, matriz[][];

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        matriz = new int[10][10];
        for (fila = 0; fila < 10; fila++) {
            for (columna = 0; columna < 10; columna++) {
                if (fila != 10) {

                    System.out.print((columna < 9 ? "0" : "") + (columna + 1) + "x" + (fila < 9 ? "0" : "") + (fila + 1) + "    ");

                } else {
                    System.out.print((columna + 1) + "x" + (fila + 1) + " ");
                }
                  //System.out.print((fila != 10) ? ((columna < 9 ? "0" : "") + (columna + 1) + "x" + (fila < 9 ? "0" : "") + (fila + 1) + "    ") : ((columna + 1) + "x" + (fila + 1) + " "));
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (fila2 = 0; fila2 < 10; fila2++) {
            for (columna2 = 0; columna2 < 10; columna2++) {
                matriz[fila2][columna2] = (fila2 + 1) * (columna2 + 1);
            }
        }
        System.out.println("Ingrese la fila que desea consultar");
        filausuario = input.nextInt();
        System.out.println("Ingrese la columna que desea consultar");
        columnausuario = input.nextInt();
        System.out.println(matriz[filausuario - 1][columnausuario - 1]);
    }
}