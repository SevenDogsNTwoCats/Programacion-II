public class CarWash {
    double[] dinero=new double[30];
    String[] servicio=new String[30];
    int clientes;
    int clientesnoatgnrl;
    int clientesatgnrl;
    int clientesnoatmotor;
    int clientesatmotor;
    int clientesnoatchasis;
    int clientesatchasis;
    int lavadogeneral;
    int lavadomotor;
    int lavadochasis;
    int cantidadlvgeneral;
    int cantidadlvmotor;
    int cantidadlvchasis;

    public CarWash(int lavadogeneral, int lavadochasis, int lavadomotor){
        this.lavadochasis=lavadochasis;
        this.lavadogeneral=lavadogeneral;
        this.lavadomotor=lavadomotor;
    }

    public void generarclientes(){

        for(int i=0;i<30;i++){
            int b;
            b=(int)(Math.random()*3+1);
                this.dinero[i]=Math.random()*1000+500;
            if(b==1)
                this.servicio[i]="Lavado General";
            if(b==2)
                this.servicio[i]="Lavado Motor";
            if(b==3)
                this.servicio[i]="Lavado Chasis";
        }
    }

    public void atenderclientes(){
        for(int i=0;i<30;i++){
            if(this.servicio[i].equals("Lavado General")){
                this.cantidadlvgeneral++;
            }
            if(this.servicio[i].equals("Lavado Motor")){
                this.cantidadlvmotor++;
            }
            if(this.servicio[i].equals("Lavado Chasis")){
                this.cantidadlvchasis++;
            }
        }

        if(cantidadlvgeneral>=this.lavadogeneral){
            clientesatgnrl=this.lavadogeneral;
            clientesnoatgnrl=cantidadlvgeneral-this.lavadogeneral;
        }
        else{
            clientesatgnrl=cantidadlvgeneral;
        }

        if(cantidadlvmotor>=this.lavadomotor){
            clientesatmotor=this.lavadomotor;
            clientesnoatmotor=cantidadlvmotor-this.lavadomotor;
        }
        else{
            clientesatmotor=cantidadlvmotor;  
        }
        if(cantidadlvchasis>=this.lavadochasis){
            clientesatchasis=this.lavadochasis;
            clientesnoatchasis=cantidadlvchasis-this.lavadochasis;
        }
        else{
            clientesatchasis=cantidadlvchasis;
        }
    }

    public void reporte(){
        int general,motor,chasis,total;
        general=clientesatgnrl*350;
        motor=clientesatmotor*150;
        chasis=clientesatchasis*400;
        total=general+chasis+motor;

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("\nServicio\t Total vendido");
        System.out.printf("\nLavado general\t%d\nLavado motor\t%d\nLavado chasis\t%d",general,motor,chasis);
        System.out.println("\n\nTotal: "+total);
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("\nServicio\tClientes atendidos");
        System.out.printf("\nLavado general\t%d\nLavado motor\t%d\nLavado chasis\t%d",clientesatgnrl,clientesatmotor,clientesatchasis);
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("\nServicio\tClientes no atendidos");
        System.out.printf("\nLavado general\t%d\nLavado motor\t%d\nLavado chasis\t%d",clientesnoatgnrl,clientesnoatmotor,clientesnoatchasis);
    } 
}

