public class ObjetoEnArregloPrueba {
    public static void main(String arg[]){
     ObjetoEnArreglo disel = new ObjetoEnArreglo("DISEL", 98.02, 200);
     ObjetoEnArreglo gasolina = new ObjetoEnArreglo("GASOLINA", 95.02, 300);
     ObjetoEnArreglo gsuper = new ObjetoEnArreglo("SUPER", 102.5, 300);

     ObjetoEnArreglo tiposgasolina[]={disel,gasolina,gsuper};

     for(int i=0;i<3;i++){
                System.out.println(tiposgasolina[i].getnombre());
                System.out.println(tiposgasolina[i].getprecio());
                System.out.println(tiposgasolina[i].getlitros());

         }
     }
    
}
