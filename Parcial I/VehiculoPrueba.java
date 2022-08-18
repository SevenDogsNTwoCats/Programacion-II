import java.util.Scanner;
public class VehiculoPrueba {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        Vehiculo nVehiculo=new Vehiculo(false, false, 0, "", false,true);
        int a,b;
        //menu
        do{
            System.out.println("1. Encender \n2. Acelerar \n3. Girar \n4. Retroceder \n5. Apagar");
            a=entrada.nextInt();
            switch(a){
                case 1:
                    nVehiculo.setencerder(true);
                    System.out.println(nVehiculo.getencender());
                break;

                case 2:
                    nVehiculo.setaceleracion(true);
                    System.out.println(nVehiculo.getaceleracion());
                break;

                case 3:
                    System.out.println("1. Izquierda \t 2. Derecha");
                    b=entrada.nextInt();
                    switch(b){
                        case 1:
                            nVehiculo.setgirar("Izquierda");
                            System.out.println(nVehiculo.getgirar());
                            break;
                        case 2:
                            nVehiculo.setgirar("Derecha");
                            System.out.println(nVehiculo.getgirar());
                            break;
                        default:
                            System.out.println("ELija una opcion valida");
                            break;
                    }
                break;

                case 4:
                    nVehiculo.setretroceder(true);
                    System.out.println(nVehiculo.getretroceder());
                    nVehiculo.setretroceder(false);
                break;

                case 5:
                    nVehiculo.setapagar(true);
                    System.out.println(nVehiculo.getapagar());
                    
                break;

                default:
                System.out.println("Elija una opcion valida");
                break;
            }
        }while(a!=5);
        entrada.close();
    }    
}
