import java.util.Scanner;

public class CelsiusFarhenheit {

    public static void main(String arg[]){
    double celsius;
    double farhenheit;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite la temperatura en Celsisus ");
    celsius = entrada.nextDouble();
    entrada.close();

    farhenheit = 32 + (9*celsius/5);

    System.out.printf("La temperatura en Farhenheit es: %.2f",farhenheit);
}
}
