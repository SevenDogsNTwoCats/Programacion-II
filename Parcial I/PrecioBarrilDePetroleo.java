import java.util.Scanner;
public class PrecioBarrilDePetroleo {
    public static void main(String args[]){
        float PrecioBDP;
        int litroscompra;
        float preciolitro;
        float impuesto=0;
        float total;
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el precio del barril de petroleo ");
        PrecioBDP= entrada.nextFloat();
        System.out.println("Ingrese la cantidad de litros que desea comprar ");
        litroscompra= entrada.nextInt();
        entrada.close();

        if(PrecioBDP>400){
            if(PrecioBDP<401){
                impuesto = (PrecioBDP*15)/100;
            }
            if(PrecioBDP>=401 && PrecioBDP<=500){
                impuesto=(PrecioBDP*13)/100;
            }
            if(PrecioBDP>500){
                impuesto=(PrecioBDP*10)/100;
            }
            preciolitro=PrecioBDP/159;
            total= litroscompra*preciolitro+impuesto;

            System.out.printf("\n El precio que debe pagar por %d litros es %.2f",litroscompra,total);
        }

    }
}
