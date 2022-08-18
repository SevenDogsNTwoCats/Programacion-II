public class CarWashPrueba {
    public static void main(String arg[]){
        CarWash newCarWash=new CarWash(10,3,7);

        newCarWash.generarclientes();
        newCarWash.atenderclientes();
        newCarWash.reporte();
    }
}
