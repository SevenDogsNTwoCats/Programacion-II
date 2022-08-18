public class ProductoRun {
    public static void main(String[] args) {
        ProductoNoPerecedero producto1=new ProductoNoPerecedero("Jabon            ", 20);
        ProductoNoPerecedero producto2=new ProductoNoPerecedero("Vino Tinto       ", 439);
        ProductoNoPerecedero producto3=new ProductoNoPerecedero("Vino Blanco      ", 294);
        ProductoNoPerecedero producto4=new ProductoNoPerecedero("Termometro Medico",1455);
        ProductoNoPerecedero producto5=new ProductoNoPerecedero("Tensiometro      ", 1455.90f);
        ProductoPerecedero producto6=new ProductoPerecedero("New York Choise Lb   ", 315.90f, 2);
        ProductoPerecedero producto7=new ProductoPerecedero("Rib Eye Choise Lb    ", 337.90f, 5);
        ProductoPerecedero producto8=new ProductoPerecedero("Cafe Nescafe Clasico  ", 139.90f, 8);
        ProductoPerecedero producto9=new ProductoPerecedero("Leche 1L              ", 31.12f, 3);
        ProductoPerecedero producto10=new ProductoPerecedero("Bistec-Muslo de pollo ", 38.90f, 1);
    
        ProductoNoPerecedero productosnp[]={producto1,producto2,producto3,producto4,producto5};
        ProductoPerecedero productosp[]={producto6,producto7,producto8,producto9,producto10};

        //imprimir dat
        System.out.println("\n---------------------------------------------------------------------------------------------------------");
        System.out.printf("NOMBRE\t\t\t    PERECEDERO\t\tPRECIO\t    DIAS A CADUCAR\tPRECIO FINAL");
        System.out.println("\n---------------------------------------------------------------------------------------------------------");

        for(int i=0;i<5;i++){
            System.out.println("\n"+productosnp[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println("\n"+productosp[i]);
        }
        System.out.println("\n---------------------------------------------------------------------------------------------------------");

    }
    
}
