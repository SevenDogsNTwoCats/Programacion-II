import java.util.Scanner;
public class AdivinarNumero {
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int intento;

        numero=(int)(Math.random()*25+1);
        System.out.println(numero);
        System.out.println("Intente Adivinar el numero ");
        do{
            intento=entrada.nextInt();
            if(intento<numero){
                System.out.println("Menor");
            }
            if(intento>numero){
                System.out.println("Mayor");
            }
            if(intento==numero){
                System.out.println("Acertaste");
            }
        }while(intento!=numero);
        entrada.close();
    }
}
