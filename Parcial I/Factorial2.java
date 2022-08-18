import java.util.Scanner;

public class Factorial2 {
    public static void main(String args[]){
        int n;
        int fac=1;
        Scanner entrada=new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero mayor a cero");
            n=entrada.nextInt();
        }while(n<=0);
        entrada.close();

        for(int i=1;i<=n;i++){
            fac*=i;
        }
        System.out.printf("%d! = %d",n,fac);
    }
    
}
