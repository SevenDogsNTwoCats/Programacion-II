import java.util.Scanner;

public class palindromo {
    public static void main(String[] args){
        String palabra="";
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese la palabra: ");
        palabra=entrada.nextLine();
        entrada.close();
        
        int i=0;
        int j= palabra.length()-1;
        boolean error= false;

        while((i<j) && !error){
            if(palabra.charAt(i)==palabra.charAt(j)){
                i++;
                j--;
            }else{
                error=true;
            }
        }
        if (!error)
            System.out.println(palabra + " es un PALINDROMO");
        else
            System.out.println(palabra + " no es un PALINDROMO");

    }
}
