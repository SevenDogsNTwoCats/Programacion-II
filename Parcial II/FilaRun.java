public class FilaRun {
    public static void main(String[] args) {
        int[] fila={25,100,25,25,25,100,75,100,200,25,25,100,100,50,25};
        boolean[] vendidos=new boolean[fila.length];
        int cambio=0;

        for(int i=0;i<fila.length;i++){
            if(cambio==0 && fila[i]>25){
            vendidos[i]=false;
        }
            if(fila[i]==25||cambio>=fila[i]||fila[i]-cambio==25){
                cambio+=25;
                if(fila[i]>25){
                    int n=fila[i]-25;
                    cambio=cambio-n;
                }
                vendidos[i]=true;
            }
        }
        System.out.println("Posiciones en fila a los que se les vendio boletos");
        for(int i=0;i<vendidos.length;i++){
            if(vendidos[i]){
                System.out.printf(i+1+"  ");
            }
        }
        System.out.println("\nPosiciones en fila a los que no se les vendio boletos");
        for(int i=0;i<vendidos.length;i++){
            if(!vendidos[i]){
                System.out.printf(i+1+"  ");
            }
    }
}
}
