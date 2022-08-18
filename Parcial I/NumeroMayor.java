import java.util.Scanner;

public class NumeroMayor {
    public static void main(String arg[]){
        Scanner entrada=new Scanner(System.in);
        int a,b,c;

        System.out.println("Ingrese a ");
        a= entrada.nextInt();   
        System.out.println("Ingrese b ");
        b= entrada.nextInt();  
        System.out.println("Ingrese c ");
        c= entrada.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.printf("\na=%d es mayor",a);
            }
            else{
                System.out.printf("\nc=%d es mayor",c);
            }
        }
        else{
            if(b>c){
                System.out.printf("\nb=%d es mayor",b);
            }
            else{
                System.out.printf("\nc=%d es mayor",c);
            }
        }
        entrada.close();
    }}