import java.util.Scanner;

public class EjercicioClase {
    public static void main(String args[]){
        int edad;
        String genero;
        int cmayorh=0;
        int cmenorh=0;
        int cmayorm=0;
        int cmenorm=0;
        Scanner entrada=new Scanner(System.in);

        for(int i=0;i<10;i++){
           do{
            System.out.printf("Ingrese el sexo de la persona %d ",i+1);
            genero=entrada.nextLine();
           }while(!genero.equalsIgnoreCase("femenino") && !genero.equalsIgnoreCase("masculino"));
           System.out.printf("Ingrese la edad de la persona %d ",i+1);
           edad=entrada.nextInt();

            if(genero.equalsIgnoreCase("femenino") && edad<60){
            cmenorm++;
            }
            if(genero.equalsIgnoreCase("femenino") && edad>=60){
                cmayorm++;
                }
                if(genero.equalsIgnoreCase("masculino") && edad<60){
                    cmenorh++;
                    }
                    if(genero.equalsIgnoreCase("masculino") && edad>=60){
                        cmayorh++;
                        }
        }entrada.close();
        

        System.out.printf("\n Hombres mayores de edad: %d \n Hombres menores de edad: %d \n Mujeres mayores de edad: %d \n Mujeres menores de edad: %d",cmayorh,cmenorh,cmayorm,cmenorm);


    }
}
