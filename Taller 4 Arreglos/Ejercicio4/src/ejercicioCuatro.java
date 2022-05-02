public class ejercicioCuatro {

    public static int columna,columna2,fila,fila2,i,j,matriz[][],matriz2[][],x;

    public static void main(String args[]) {

        matriz = new int[4][5];
        matriz2 = new int[4][5];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5;
        matriz[1][0] = 6;
        matriz[1][1] = 7;
        matriz[1][2] = 8;
        matriz[1][3] = 9;
        matriz[1][4] = 10;
        matriz[2][0] = 11;
        matriz[2][1] = 12;
        matriz[2][2] = 13;
        matriz[2][3] = 14;
        matriz[2][4] = 15;
        matriz[3][0] = 16;
        matriz[3][1] = 17;
        matriz[3][2] = 18;
        matriz[3][3] = 19;
        matriz[3][4] = 20;

        for (fila=0;fila<=3;fila++) {
            for (columna=0;columna<=4;columna++) {
                System.out.print(matriz[fila][columna]+" ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        x = 1;

        for (i=0;i<=3;i++) {
            for (j=0;j<=4;j++) {
                matriz2[i][j] = x;
                x = x+1;
            }
        }

        for (fila2=0;fila2<=3;fila2++) {
            for (columna2=0;columna2<=4;columna2++) {
                if (fila2%2==0) {
                    System.out.print(matriz2[fila2][columna2]+" ");
                } else {
                    System.out.print(matriz2[fila2][4-columna2]+" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");
    }
}