public class EmpleadosPrueba {
    public static void main(String[] args) {
        //un empleado de cada tipo
        EmpleadosJardinero empleado1=new EmpleadosJardinero("Juan Dominguez", 54, "Hombre", 98362712, 45, 130);
        EmpleadosPintor empleado2=new EmpleadosPintor("Maria Lopez", 33, "Mujer", 97261811, 30, 95, "Exterior");
        //informacion de cada empleado
        System.out.println("------------------------------------");
        System.out.println(empleado1);
        System.out.println("------------------------------------");
        System.out.println(empleado2);
        //crear una una factura para un cliente
        EmpleadosFactura factura1=new EmpleadosFactura(1, "25/7/2021", "0803-1969-13104", 34);
        //imprime tostring de la facura
        System.out.println("------------------------------------");
        System.out.println(factura1);
        //imprime el total a pagar de la factura
        //si el servicio es 1=jardineria entonces le envia el precio que cobra el jardinero por el trabajo
        //si el servicio es 2=pintar entonces le envia el precio que cobra el pintor por el trabajo
        switch (factura1.getServicio()){
            case 1:
                System.out.println("SERVICIO: JARDINERIA");
                System.out.println("TOTAL A PAGAR: "+factura1.calcularfactura(factura1.getUservicio(),empleado1.getYardap()));
                break;
            case 2:
                System.out.println("SERVICIO: PINTOR");
                System.out.println("TOTAL A PAGAR: "+factura1.calcularfactura(factura1.getUservicio(), empleado2.getPmpintado()));
                break;
        } 
        //crear otra factura
        EmpleadosFactura factura2=new EmpleadosFactura(2, "26/7/2021", "0801-1982-23456", 45);
        System.out.println("------------------------------------");
        System.out.println(factura2);
        switch (factura2.getServicio()){
            case 1:
                System.out.println("SERVICIO: JARDINERIA");
                System.out.println("TOTAL A PAGAR: "+factura2.calcularfactura(factura2.getUservicio(),empleado1.getYardap()));
                break;
            case 2:
                System.out.println("SERVICIO: PINTOR");
                System.out.println("TOTAL A PAGAR: "+factura2.calcularfactura(factura2.getUservicio(), empleado2.getPmpintado()));
                break;
        }
    }
}
