import java.util.Scanner;

public class KmporhAmpors {
    public static void main(String arg[]){
        Scanner entrada=new Scanner(System.in);
        double kmporh;
        double ms;
        System.out.println("Ingrese la velocidad en Km/h ");
        kmporh= entrada.nextDouble();
        entrada.close();

        ms= kmporh*100*3600;

        System.out.printf("\n La velocidad en m/s es %.2f",ms);
    }
}
