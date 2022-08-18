import java.util.Scanner;
public class RentaVehiculosPrueba{
    public static void main(String arg[]){
    RentaVehiculos newRentaVehiculos= new RentaVehiculos((int)(Math.random()*10+5), (int)(Math.random()*25+15),(int)(Math.random()*30+25));
    Scanner entrada=new Scanner(System.in);
        int rpickups,rturismos,rcamionetas;

    System.out.println("Ingrese la cantidad de clientes:");
    do{
        System.out.printf("Rentar PICKUPS: ");
        rpickups=entrada.nextInt();

        System.out.printf("Rentar TURIMOS: ");
        rturismos=entrada.nextInt();

        System.out.printf("Rentar CAMIONETAS: ");
        rcamionetas=entrada.nextInt();
        if(rcamionetas<newRentaVehiculos.getpromedio())
        System.out.println("la renta debe ser mayor de "+newRentaVehiculos.getpromedio());
    }while(rcamionetas+rpickups+rcamionetas<newRentaVehiculos.getpromedio());

    newRentaVehiculos.setrpickup(rpickups);
    newRentaVehiculos.setcamioneta(rcamionetas);
    newRentaVehiculos.setrturismo(rturismos);
    System.out.println("\n TIPO\t\tCANTIDAD");
    System.out.printf("PICKUP\t\t%d\nTURISMO\t\t%d\nCAMIONETAS\t%d",newRentaVehiculos.getrpickup(),newRentaVehiculos.getrturismo(),newRentaVehiculos.getrcamioneta());
    
    newRentaVehiculos.dinerogenerado();
    newRentaVehiculos.clientesnoatendidos(rpickups, rturismos, rcamionetas);
    entrada.close();
}}
