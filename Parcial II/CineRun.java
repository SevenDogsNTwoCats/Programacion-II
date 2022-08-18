import java.util.ArrayList;

public class CineRun {
    public static void main(String[] args) {
        String peliculas[]={"Blade Runner","Eva","Snowden"};
        String directores[]={"Denis Villeneuve","Kike Maillo","Oliver Stone"};
        int duracion[]={117,94,134};
        int edadmin[]={17,13,5};
        
        String nombres[]={"Mario","Juan","Pedro","Maria","Ana","Rosa","Josefa","Antonio","Alan","Rocco","Juana","Teresa","Karla","Carlos","Rodrigo","Micaela"};
        ArrayList<CineEspectador> espectadores=new ArrayList<>();

        int aleatorio;
        aleatorio= (int)(Math.random()*3);
        Cine cine1=new Cine("Cine #1", peliculas[aleatorio],duracion[aleatorio], edadmin[aleatorio], directores[aleatorio], (int)(95+Math.random()*500));
        //genera 40 espectadores de nombre, edad y dinero aleatorio, los guarda en un arraylist
        for(int i=0;i<40;i++){
            aleatorio=(int)(Math.random()*nombres.length);
            CineEspectador espectador=new CineEspectador(nombres[aleatorio]+i,3+(int)(Math.random()*60), Math.random()*700);
            espectadores.add(espectador);
        }
        //imprime datos del cine
                System.out.println(cine1);
                System.out.println("");
                
                System.out.println("Asientos");
                System.out.println("\n--------------------------------------------------------------------------------------------");
                //sienta en la fila A a 5 espectadores si tienen el dinero y la edad para ver la pelicula
        int contador=0;
            for(int i=0;i<40;i++){
                if(espectadores.get(i).getDinero()>cine1.getPrecioentrada()){
                if(espectadores.get(i).getEdad()>cine1.getEdadmin()){
                contador++;
                System.out.printf("\tA"+contador+": "+espectadores.get(i).getNombre());
                espectadores.get(i).setDinero(0);
                if(contador==5)
                break;
            }}
        }
        //sienta en la fila B a 5 espectadores si tienen el dinero y la edad para ver la pelicula
        contador=0;
        System.out.println();
        for(int i=0;i<40;i++){
            if(espectadores.get(i).getDinero()>=cine1.getPrecioentrada()){
            if(espectadores.get(i).getEdad()>=cine1.getEdadmin()){
            contador++;
            System.out.printf("\tB"+contador+": "+espectadores.get(i).getNombre());
            espectadores.get(i).setDinero(0);
            if(contador==5)
            break;
        }}
    }
    contador=0;
    System.out.println();
        for(int i=0;i<40;i++){
            if(espectadores.get(i).getDinero()>=cine1.getPrecioentrada()){
            if(espectadores.get(i).getEdad()>=cine1.getEdadmin()){
            contador++;
            System.out.printf("\tC"+contador+": "+espectadores.get(i).getNombre());
            espectadores.get(i).setDinero(0);
            if(contador==5)
            break;
        }}
        }
        contador=0;
        System.out.println();
        for(int i=0;i<40;i++){
        if(espectadores.get(i).getDinero()>=cine1.getPrecioentrada()){
        if(espectadores.get(i).getEdad()>=cine1.getEdadmin()){
        contador++;
        System.out.printf("\tD"+contador+": "+espectadores.get(i).getNombre());
        espectadores.get(i).setDinero(0);
        if(contador==5)
        break;
        }}
        }
        contador=0;
        System.out.println();
        for(int i=0;i<40;i++){
            if(espectadores.get(i).getDinero()>=cine1.getPrecioentrada()){
            if(espectadores.get(i).getEdad()>=cine1.getEdadmin()){
            contador++;
            System.out.printf("\tE"+contador+": "+espectadores.get(i).getNombre());
            espectadores.get(i).setDinero(0);
            if(contador==5)
            break;
        }}
        }
        System.out.println("\n--------------------------------------------------------------------------------------------");

    }
        
}


