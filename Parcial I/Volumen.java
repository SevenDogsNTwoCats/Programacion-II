import java.util.Scanner;

public class Volumen {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        double radio;
        double v;

        System.out.println("Ingrese el radio de la esfera ");
        radio=entrada.nextDouble();
        entrada.close();
        v= (4/3)*3.1416*Math.pow(radio,3);

        System.out.printf("El volumen de la esfera es %.2f",v);
    }
}
