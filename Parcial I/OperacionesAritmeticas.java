import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String arg[]){
        float a,b, suma, resta, division, multiplicacion;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingrese a ");
        a= entrada.nextFloat();
        System.out.println("Ingrese b ");
        b= entrada.nextFloat();
        entrada.close();
    //suma
        suma = a+b;
        System.out.printf("La suma de %.2f mas %.2f es %.2f",a,b,suma);
    //resta
        resta = a-b;
        System.out.printf("\nLa resta de %.2f menos %.2f es %.2f",a,b,resta);
    //multiplicacion
        multiplicacion = a*b;
        System.out.printf("\nLa multiplicacion de %.2f por %.2f es %.2f",a,b,multiplicacion);
    //division
        division = a/b;
        System.out.printf("\nLa division de %.2f entre %.2f es %.2f",a,b,division);
    }
}
