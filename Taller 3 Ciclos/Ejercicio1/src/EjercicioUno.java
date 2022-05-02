public class EjercicioUno {

    public static int j, i;

    public static void main(String[] args) {

        for (i=10; i>0; i--){
            for (j=1; j<10-i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

