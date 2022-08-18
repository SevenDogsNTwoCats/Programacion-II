import java.util.Scanner;

public class Notas {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int nota;
        int reprobadas=0;
        int muybuena=0;
        int sobresaliente=0;

        for(int i=0;i<10;i++){
            System.out.printf("INgrese la nota del estudiante %d: ", i+1);
            nota=entrada.nextInt();
            if(nota<70){
                reprobadas++;
            }
            if(nota>=70&&nota<=85){
                muybuena++;
            }
            if(nota>85){
                sobresaliente++;
            }
        }entrada.close();

        System.out.printf("\n Reprobados: %d \n Muy Buena: %d \n Sobresalientes: %d", reprobadas,muybuena,sobresaliente);
    }
    
}
