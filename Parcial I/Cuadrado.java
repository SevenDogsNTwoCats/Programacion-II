import java.util.Scanner;

public class Cuadrado {

    public static void main(String arg[]){

        Scanner entrada = new Scanner(System.in);
        double cuadrado;
        double numero;

        System.out.println("\nDigite un numero ");
        numero=entrada.nextDouble();

        while(numero!=0){
            cuadrado=Math.pow(numero,2);
            System.out.printf("El cuadrado del numero es: %.2f", cuadrado);

            System.out.println("\nDigite un numero ");
            numero=entrada.nextDouble();
        }
        entrada.close();
    }
}
