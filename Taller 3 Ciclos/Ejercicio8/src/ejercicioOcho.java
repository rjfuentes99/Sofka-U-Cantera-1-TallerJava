import java.util.Scanner;

public class ejercicioOcho {

    public static String nombreUsuario1, nombreUsuario2,nombreUsuario3,nombreUsuario4,nombreUsuario5,nombreUsuario6,nombreUsuario7,nombreUsuario8;
    public static int opcion,opcion2, nota1,nota2,nota3,nota4,nota5,nota6,nota7,nota8;
    public static Scanner lword = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        nombreUsuario1 = "Estudiante no registrado";
        nombreUsuario2 = "Estudiante no registrado";
        nombreUsuario3 = "Estudiante no registrado";
        nombreUsuario4 = "Estudiante no registrado";
        nombreUsuario5 = "Estudiante no registrado";
        nombreUsuario6 = "Estudiante no registrado";
        nombreUsuario7 = "Estudiante no registrado";
        nombreUsuario8 = "Estudiante no registrado";
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        nota4 = 0;
        nota5 = 0;
        nota6 = 0;
        nota7 = 0;
        nota8 = 0;

        do {
            opcion = capturaOpcionMenu();
            evaluarOpcionUsuario(opcion);
        }while (opcion!=3);
    }

    public static int capturaOpcionMenu(){

        System.out.println(" ");
        System.out.println("Menu de usuario");
        System.out.println("1. Registrar estudiantes");
        System.out.println("2. Consultar estudiantes y notas");
        System.out.println("3. Salir del sistema");
        System.out.println(" ");

        return input.nextInt();
    }

    public static void evaluarOpcionUsuario(int opcion){
        switch (opcion){
            case 1:

                System.out.println(" ");
                System.out.println("Registrar Estudiante 1");
                System.out.println("Cual es el nombre del estudiante?");
                nombreUsuario1 = lword.nextLine();
                System.out.println("Cual es la nota del estudiante?");
                nota1 = input.nextInt();
                System.out.println(" ");

                System.out.println("Registrar Estudiante 2");
                System.out.println("Cual es el nombre del estudiante?");
                nombreUsuario2 = lword.nextLine();
                System.out.println("Cual es la nota del estudiante?");
                nota2 = input.nextInt();
                System.out.println(" ");

                System.out.println("Registrar Estudiante 3");
                System.out.println("Cual es el nombre del estudiante?");
                nombreUsuario3 = lword.nextLine();
                System.out.println("Cual es la nota del estudiante?");
                nota3 = input.nextInt();
                System.out.println(" ");

                System.out.println("Registrar Estudiante 4");
                System.out.println("Cual es el nombre del estudiante?");
                nombreUsuario4 = lword.nextLine();
                System.out.println("Cual es la nota del estudiante?");
                nota4 = input.nextInt();
                System.out.println(" ");

                System.out.println("Registrar Estudiante 5");
                System.out.println("Cual es el nombre del estudiante?");
                nombreUsuario5 = lword.nextLine();
                System.out.println("Cual es la nota del estudiante?");
                nota5 = input.nextInt();
                System.out.println(" ");

                System.out.println("Registrar Estudiante 6");
                System.out.println("Cual es el nombre del estudiante?");
                nombreUsuario6 = lword.nextLine();
                System.out.println("Cual es la nota del estudiante?");
                nota6 = input.nextInt();
                System.out.println(" ");

                System.out.println("Registrar Estudiante 7");
                System.out.println("Cual es el nombre del estudiante?");
                nombreUsuario7 = lword.nextLine();
                System.out.println("Cual es la nota del estudiante?");
                nota7 = input.nextInt();
                System.out.println(" ");

                System.out.println("Registrar Estudiante 8");
                System.out.println("Cual es el nombre del estudiante?");
                nombreUsuario8 = lword.nextLine();
                System.out.println("Cual es la nota del estudiante?");
                nota8 = input.nextInt();
                System.out.println(" ");

               break;
            case 2:

                System.out.println(" ");
                System.out.println("Consultar notas por estudiante");
                System.out.println("1. "+nombreUsuario1);
                System.out.println("2. "+nombreUsuario2);
                System.out.println("3. "+nombreUsuario3);
                System.out.println("4. "+nombreUsuario4);
                System.out.println("5. "+nombreUsuario5);
                System.out.println("6. "+nombreUsuario6);
                System.out.println("7. "+nombreUsuario7);
                System.out.println("8. "+nombreUsuario8);

                opcion2 = input.nextInt();

                switch (opcion2){
                    case 1:
                        if (nombreUsuario1.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota1 >= 7){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Suspendido");
                            }
                        }
                        break;
                    case 2:
                        if (nombreUsuario2.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota2 >= 7){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Suspendido");
                            }
                        }
                        break;
                    case 3:
                        if (nombreUsuario3.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota3 >= 7){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Suspendido");
                            }
                        }
                        break;
                    case 4:
                        if (nombreUsuario4.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota4 >= 7){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Suspendido");
                            }
                        }
                        break;
                    case 5:
                        if (nombreUsuario5.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota5 >= 7){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Suspendido");
                            }
                        }
                        break;
                    case 6:
                        if (nombreUsuario6.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota6 >= 7){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Suspendido");
                            }
                        }
                        break;
                    case 7:
                        if (nombreUsuario7.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota7 >= 7){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Suspendido");
                            }
                        }
                    case 8:
                        if (nombreUsuario8.equals("")) {
                            System.out.println(" ");
                            System.out.println("Estudiante no registrado");
                            System.out.println(" ");
                        }else{
                            System.out.println(" ");
                            if (nota8 >= 7){
                                System.out.println("Estudiante Aprobado");
                            }else{
                                System.out.println("Estudiante Suspendido");
                            }
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("Hasta luego gracias por usar esta aplicacion");
                break;
            default:
                System.out.println("Coloque una opcion entre la 1 y 3");
        }
    }
}
