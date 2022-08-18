public class TicketsPrueba {
    public static void main(String arg[]){
        Tickets newTickets= new Tickets(0, 0, 0);
        newTickets.entradas();
        System.out.println("******************BOLETOS******************");
        System.out.println("TIPO\tPRECIO");
        System.out.println("GRADA\t600\nGRAMA\t1000\nVIP\t2000");
        System.out.println("******************VENTA******************");
        System.out.println("TIPO\tVENDIDOS");
        System.out.printf("GRADA\t%d\nGARMA\t%d\nVIP\t%d",newTickets.getgrada(),newTickets.getgrama(),newTickets.getvip());
        System.out.println("\n******************REPORTE******************");
        System.out.println("TIPO\tDINERO POR TIPO DE BOLETO");
        newTickets.reporte();
    }
}
