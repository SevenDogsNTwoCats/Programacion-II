import java.util.Scanner;

public class CuadradoDeNumeroMaroyQueCero {
    public static void main(String arg[]){
        int a;
        double c;
        Scanner entrada=new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero mayor a cero");
            a=entrada.nextInt();
        }while(a<=0);
        entrada.close();
        c=Math.pow(a, 2);
        System.out.printf("El cuadrado de %d es %.0f",a,c);
    }
    
}
