import java.util.Scanner;

public class EjercicioNueve {

    public static double base,altura,areaRectangulo,areaTriangulo,areaTrapecio,basemayor,basemenor ;
    public static int opcion;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        opcion = primerProceso();
        segundoProceso(opcion);

    }

    private static int primerProceso(){
        System.out.println("De que figura quieres definir el area?");
        System.out.println("Recuerda dar los datos en cm");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Trapecio");
        return input.nextInt();
    }

    private static void segundoProceso(int opcion){
        switch (opcion){
            case 1:
                System.out.println("Cual es la altura del rectangulo?");
                altura = input.nextDouble();
                System.out.println("Cual es la base del rectangulo?");
                base = input.nextDouble();
                areaRectangulo = base/altura;
                System.out.println("Entonces si la base del rectangulo es: "+base+"y su altura es: "+altura+" entonces su area es de: "+areaRectangulo+"cm");
                break;
            case 2:
                System.out.println("Cual es la altura del triangulo?");
                altura = input.nextDouble();
                System.out.println("Cual es la base del triangulo?");
                base = input.nextDouble();
                areaTriangulo = base*altura/2;
                System.out.println("Entonces si la base del triangulo es: "+base+"y su altura es: "+altura+" entonces su area es de: "+areaTriangulo+"cm");
                break;
            case 3:
                System.out.println("Cual es la altura del trapecio?");
                altura = input.nextDouble();
                System.out.println("Cual es la base mayor del trapecio?");
                basemayor = input.nextDouble();
                System.out.println("Cual es la base menor del trapecio?");
                basemenor = input.nextDouble();
                areaTrapecio = basemayor+basemenor/2+altura;
                System.out.println("Entonces si la base mayor del trapecio es: "+basemayor+" y su base menor es: "+basemenor+"y su altura es: "+altura+" entonces su area es de: "+areaTrapecio+"cm");
                break;
            default:
                System.out.println("Introduzca la opcion correcta entre el 1 y el 3");
        }
    }
}

