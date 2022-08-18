import java.util.Scanner;
public class Lavadora2 {
    public static void main (String[] args){
        int encender;
        int a;
        int b;
        int pieza;
        Scanner entrada=new Scanner(System.in);
        Lavadora nvaLavada = new Lavadora(false, "",0,"");
//encender lavadora
        System.out.println("Presione 1 para encendeder la lavadora");
        do {
            encender = entrada.nextInt();
            if(encender==1){
                 nvaLavada.Setencendio(true);
            }
            System.out.println("Lavadora "+ nvaLavada.getencendido());
             
        }while (encender!=1);
        //sleccionar carga y piezas
        do{
        System.out.println("Seleccione la carga \n1. Pequena \t2. Mediana \t3. Grande");
        a = entrada.nextInt();
        switch (a) {
            case 1:
                nvaLavada.Setcarga("Pequena");
                break;
            case 2:
            nvaLavada.Setcarga("Mediana");
                break;
            case 3:
            nvaLavada.Setcarga("Grande");
                break;
        }
        System.out.println("Ha selecciona Carga "+nvaLavada.getcarga());

        System.out.println("Ingrese la cantidad de piezas a lavar");
            pieza=entrada.nextInt();
            nvaLavada.Setpiezas(pieza);
            nvaLavada.compatible();
       System.out.println(nvaLavada.getcompatibilidad());
    }while(!nvaLavada.compatibilidad);
//tipo de lavado
    do{
     System.out.println("Ingrese el tipo de lavado: \n1.Lavado a mano \t2. Piezas delicada \t3.Piezas de color \t4. Piezas color blanco");
     b=entrada.nextInt();
     switch (b) {
        case 1:
            nvaLavada.Setcarga("Lavado a mano");
            break;
        case 2:
        nvaLavada.Setcarga("Piezas delicadas");
            break;
        case 3:
        nvaLavada.Setcarga("Piezas de color");
            break;
            case 4:
        nvaLavada.Settipolavado("Piezas color blanco");
            break;
        default:
            System.out.println("Seleccione el numero de una de las opciones");
            break;
    }}while(b<1 && b>4);
//detergente e Iniciar lavado
    nvaLavada.Detergente();
    System.out.println(nvaLavada.getDetergente());
    System.out.println(nvaLavada.Iniciar());

    entrada.close();
   } 
}
