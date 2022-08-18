public class ProductosFinancierosRun {
    public static void main(String[] args) {
        ProductosFinancieros pf1=new ProductosFinancieros(92821, 0.15, 3000, 500);
        ProductosFinancieros pf2=new ProductosFinancieros(82721, 0.05, 300, 500);
        ProductosFinancieros pf3=new ProductosFinancieros(62718, 0.14, 10000, 11000);
        ProductosFinancieros pf4=new ProductosFinancieros(78283, 0.16, 20000, 12333);
        ProductosFinancieros array[]={pf1,pf2,pf3,pf4};

        for(int i=0;i<4;i++)
            System.out.println(array[i]);
    }
}
