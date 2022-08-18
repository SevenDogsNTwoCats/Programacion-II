import java.util.Scanner;

public class TasaDeInteres {
public static void main(String arg[]){
    Scanner entrada=new Scanner(System.in);
    Double R;
    int P;
    int N;
    Double c;
//c = p(1+r) ^ n
    System.out.println("Ingrese el monto");
    P=entrada.nextInt();
    entrada.close();

    R=0.1;
    System.out.println("\nAnyo \t Monto");
    for(N=1;N<=10;N++){
        c = P*Math.pow((1+R),N);
        System.out.printf("\n%d \t %.2f",N,c);
    }
    
}
}
