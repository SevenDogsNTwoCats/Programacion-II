import java.util.Scanner;

public class Factorial {
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        int limite;
        double factorial;

        do{
            System.out.println("Escriba un numero > 0 ");
            limite = entrada.nextInt();
            entrada.close();
            
        }while(limite<=0);
        for(int i=0;i<=limite;i++){
            factorial=1;

            for(int j=1;j<=i;j++){
                factorial*=j;
            }
            System.out.printf("%2d!=%.0f %n", i,factorial);
        }
    }
}
