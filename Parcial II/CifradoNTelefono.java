import java.util.Scanner;
public class CifradoNTelefono {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        int primer,segundo,tercero,cuarto;
        System.out.println("Ingrese el numero para cifrarlo");
        numero=entrada.nextInt();
        //dividir el numero en digitos
        cuarto = numero%10;
        numero = numero/10;
        tercero = numero%10;
        numero = numero/10;
        segundo = numero%10;
        numero = numero/10;
        primer= numero%10;
        //cifrarlo
        cuarto=(cuarto+9)%10;
        tercero=(tercero+9)%10;
        segundo=(segundo+9)%10;
        primer=(primer+9)%10;
        //imprimir
        System.out.printf("\nCifrado: %d %d %d %d",tercero,cuarto,primer,segundo);
        //**********************************reto**************************************
        System.out.println("\n\nIngrese el numero para descifrarlo");
        numero=entrada.nextInt();
        entrada.close();
        //dividir el numero en digitos
        cuarto = numero%10;
        numero = numero/10;
        tercero = numero%10;
        numero = numero/10;
        segundo = numero%10;
        numero = numero/10;
        primer= numero%10;
        //descifrar
        cuarto=(cuarto+1);
        tercero=(tercero+1);
        segundo=(segundo+1);
        primer=(primer+1);
        //imprimir
        System.out.printf("\nDecifrado: %d %d %d %d",tercero,cuarto,primer,segundo);
    }
}
