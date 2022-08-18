import java.util.Scanner;
class PruebaCalificaciones {
    public static void main(String arg[]){
        int a;
        Scanner entrada=new Scanner(System.in);
        int A[]={65,78,98,45,23,99};
        Calificaciones newCalificaciones= new Calificaciones("",A);

        System.out.println("\n\n1. Establecer nombre del curso \n2. Obtener nombre del curso\n3. Imprimir Calificaciones\n4. Minimima calificacion\n5. Maxima calificacion\n6. Obtener promedio\n7. Procesar Calificaciones\n8. Salir");
        do{
             a=entrada.nextInt();
             switch(a){
                case 1:
                entrada.nextLine();
                    System.out.println("\t\t\tIngrese el nombre del curso");
                    String nombrecurso=entrada.nextLine();
                    newCalificaciones.setnombrecurso(nombrecurso);
                break;
                case 2:
                    System.out.println(newCalificaciones.getnombrecurso());
                break;
                case 3:
                    newCalificaciones.imprimircalificacion();
                break;
                case 4:
                    System.out.println("\n\nCalificacion minima: "+newCalificaciones.getmincalificacion());
                break;
                case 5:
                    System.out.println("\n\nCalificacion maxima: "+newCalificaciones.getmaxcalificacion());
                break;
                case 6:
                    System.out.println("\n\nPromedio: "+newCalificaciones.getpromedio());
                break;
                case 7:
                    newCalificaciones.imprimircalificacion();
                    System.out.println("\n\nPromedio: "+newCalificaciones.getpromedio());
                    System.out.println("\n\nCalificacion minima: "+newCalificaciones.getmincalificacion());
                    System.out.println("\n\nCalificacion maxima: "+newCalificaciones.getmaxcalificacion());
                break;
                default:
                    System.out.println("Seleccione una opcion valida");
                break;
             }
        }while(a!=8);
        entrada.close();
    }
}
