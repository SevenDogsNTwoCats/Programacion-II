public class InmuebleRun {
    public static void main(String[] args) {
        InmuebleApartamento apartamento1=new InmuebleApartamento("00023451", 6098.85f, true, 3);
        InmuebleApartamento apartamento2=new InmuebleApartamento("00389272", 4002.90f, false, 1);
        InmuebleApartamento apartamento3=new InmuebleApartamento("89201001", 9000.00f, true, 10);
        InmuebleCasa casa1=new InmuebleCasa("089029281", false, 600, 8000.45, "Blanco");
        InmuebleCasa casa2=new InmuebleCasa("089029281", true, 320.6, 8000.45, "Azul");
        InmuebleBodega bodega1=new InmuebleBodega("029120171", false, 40.6, 1100.75, "A");
        InmuebleBodega bodega2=new InmuebleBodega("830902182", true, 70.0, 1300.75, "B");
        InmuebleBodega bodega3=new InmuebleBodega("802983829", true, 45.3, 1250.75, "A");
        InmuebleBodega bodega4=new InmuebleBodega("982039892", false, 35.7, 1700.75, "C");
        System.out.println("**************************APARTAMENTOS*****************************");
        System.out.println(apartamento1);
        System.out.println(apartamento2);
        System.out.println(apartamento3);
        System.out.println("\n*****************************CASAS*********************************");
        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println("\n*****************************BODEGAS*********************************");
        System.out.println(bodega1);
        System.out.println(bodega2);
        System.out.println(bodega3);
        System.out.println(bodega4);

    }
}
