public class RentaVehiculos {
    int pickup;
    int promedio;
    int turismo;
    int camioneta;
    int rpickup;
    int rturismo;
    int rcamioneta;
    int hrpickup;
    int hrturismo;
    int hrcamioneta;

    public RentaVehiculos(int pickup, int turismo,int camioneta){
        this.pickup=pickup;
        this.turismo=turismo;
        this.camioneta=camioneta;
        this.promedio= (pickup+turismo+camioneta)/3;
        this.rpickup=0;
        this.rturismo=0;
        this.rcamioneta=0;
        this.hrpickup=(int)(Math.random()*12+1);
        this.hrturismo=(int)(Math.random()*12+1);
        this.hrcamioneta=(int)(Math.random()*12+1);
    }
    public int getpickup(){
        return this.pickup;
    }
    public int getturismo(){
        return this.turismo;
    }
    public int getcamioneta(){
        return this.camioneta;
    }
    public int getpromedio(){
        return this.promedio;
    }
    public void setrpickup(int rpickup){
        if(this.pickup<rpickup)
        this.rpickup=this.pickup;
        else
            this.rpickup=rpickup; 
    }
    public void setrturismo(int rturismo){
        if(this.turismo<rturismo)
        this.rturismo=this.turismo;
        else
            this.rturismo=rturismo; 
    }
    public void setcamioneta(int rcamioneta){
        if(this.camioneta<rcamioneta)
        this.rcamioneta=this.camioneta;
        else
            this.rcamioneta=rcamioneta;  
    }
    public int getrpickup(){
        return this.rpickup;
    }
    public int getrturismo(){
        return this.rturismo;
    }
    public int getrcamioneta(){
        return this.rcamioneta;
    }
    public void dinerogenerado(){
        int dpicku,dturismo,dcamioneta,total;
        dpicku=this.rpickup*this.hrpickup*25;
        dturismo=this.turismo*this.hrturismo*20;
        dcamioneta=this.camioneta*this.hrcamioneta*30;
        total=dpicku+dcamioneta+dturismo;
        System.out.println("\n_______________________________________________");
        System.out.println("\n TIPO\t\tDINERO GENERADO");
        System.out.printf("PICKUP\t\t%d\nTURISMO\t\t%d\nCAMIONETAS\t%d",dpicku,dturismo,dcamioneta);
        System.out.println("\nMONTO TOTAL GENERADO: "+total);
    }
    public void clientesnoatendidos(int rpickup,int rturismo,int rcamioneta){
        int cpickups=0,cturismo=0,ccamioneta=0;
        if(rpickup>this.pickup)
        cpickups=rpickup-this.pickup;
        if(rturismo>this.turismo)
        cturismo=rturismo-this.turismo;
        if(rcamioneta>this.camioneta)
        ccamioneta=rcamioneta-this.camioneta;
        System.out.printf("\n******Clientes no atendidos******\nPICKUP: %d\tTURISMO: %d\tCAMIONETA: %d",cpickups,cturismo,ccamioneta);
    }
}
