public class Tickets{
    //Entradas grama, grada,vip.
    int grada;
    int grama;
    int vip;
    ///constructor
    public Tickets(int grada,int grama,int vip){
        this.grada=grada;
        this.grama=grama;
        this.vip=vip;
    }

    public void entradas(){
        int ticketsfaltantes=3000;
        do{
        this.grada=(int)(Math.random()*3000+1);
        ticketsfaltantes=this.grada-1;

        do{
        this.grama=(int)(Math.random()*ticketsfaltantes);
        ticketsfaltantes=this.grama-1;
        }while((this.grama+this.grada)>3000);

        this.vip=(int)(Math.random()*ticketsfaltantes);
    }while(((this.grama+this.grada+this.vip)!=3000)||(this.vip==0));
    }

    public int getgrada(){
        return this.grada;
    }
    public int getgrama(){
        return this.grama;
    }
    public int getvip(){
        return this.vip;
    }

    public void reporte(){
        int tgrada;
        int tgrama;
        int tvip;
        int total;

        tgrada=this.grada*600;
        tgrama=this.grama*1000;
        tvip=this.vip*2000;
        total=tgrada+tgrama+tvip;
        System.out.printf("GRADA\t%d\nGARMA\t%d\nVIP\t%d",tgrada,tgrama,tvip);
        System.out.printf("\n\nTOTAL REACAUDADO: %d\n\n",total);
    }
}
