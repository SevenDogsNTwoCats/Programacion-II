import java.util.Scanner;
public class LeerNumero {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int n;
        String numeros1[]={"UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ","ONCE","DOCE","TRECE","CATORCE","QUIENCE"};
        String numeros2[]={"VEINTE","TREINTA","CUARENTA","CINCUENTA","SETENTA","SETENTA","OCHENTA","NOVENTA"};

        do{
            System.out.println("Ingrese un numero");
            n=entrada.nextInt();
        }while(n<=0 || n>99);
        entrada.close();

        if(n<=15){
            System.out.println(numeros1[n-1]); 
        }
        if(n>15&&n<20){
            System.out.printf("%s Y %s",numeros1[9],numeros1[n-11]); 
        } 
        if(n>=20&&n<30){
            if(n==20){
                System.out.printf("%s",numeros2[0]);
            }else
            System.out.printf("%s Y %s",numeros2[0],numeros1[n-21]); 
        }
        if(n>=30 && n<40){
            if(n==30){
                System.out.printf("%s",numeros2[1]);
            }else
            System.out.printf("%s Y %s",numeros2[1],numeros1[n-31]); 
        }
        if(n>=40 && n<50){
            if(n==40){
                System.out.printf("%s",numeros2[2]);
            }else
            System.out.printf("%s Y %s",numeros2[2],numeros1[n-41]); 
        } 
        if(n>=50 && n<60){
            if(n==50){
                System.out.printf("%s",numeros2[3]);
            }else
            System.out.printf("%s Y %s",numeros2[3],numeros1[n-51]); 
        }
        if(n>=60 && n<70){
            if(n==60){
                System.out.printf("%s",numeros2[4]);
            }else
            System.out.printf("%s Y %s",numeros2[4],numeros1[n-61]); 
        }
        if(n>=70 && n<80){
            if(n==70){
                System.out.printf("%s",numeros2[5]);
            }else
            System.out.printf("%s Y %s",numeros2[5],numeros1[n-71]); 
        }
        if(n>=80 && n<90){
            if(n==80){
                System.out.printf("%s",numeros2[6]);
            }else
            System.out.printf("%s Y %s",numeros2[6],numeros1[n-81]); 
        } 
        if(n>=90 && n<100){
            if(n==90){
                System.out.printf("%s",numeros2[7]);
            }else
            System.out.printf("%s Y %s",numeros2[7],numeros1[n-91]); 
        } 
    }
}
