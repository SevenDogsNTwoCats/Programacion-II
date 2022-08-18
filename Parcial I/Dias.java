import java.util.Scanner;

public class Dias {
    public static void main(String arg[]){
    Scanner entrada = new Scanner(System.in);
    int d;
    String diasemana[]={"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};

    do{
        System.out.println("Ingrese un numero entre 1 y 7");
        d= entrada.nextInt();
    }while(d<1||d>7);
    entrada.close();

    switch(d){
        case 1:
        System.out.println(diasemana[0]);
        break;
        case 2:
        System.out.println(diasemana[1]);
        break;
        case 3:
        System.out.println(diasemana[2]);
        break;
        case 4:
        System.out.println(diasemana[3]);
        break;
        case 5:
        System.out.println(diasemana[4]);
        break;
        case 6:
        System.out.println(diasemana[5]);
        break;
        case 7:
        System.out.println(diasemana[6]);
        break;
    }

}}
