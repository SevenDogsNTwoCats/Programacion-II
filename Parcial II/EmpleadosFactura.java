public class EmpleadosFactura implements EmpleadosPagarInterfaz{
    private int servicio; //1 jardineria, 2 pintor
    private String fecha;
    private String id;
    private int uservicio;

    public EmpleadosFactura(int servicio, String fecha, String id, int uservicio) {
        this.servicio = servicio;
        this.fecha = fecha;
        this.id = id;
        this.uservicio = uservicio;

    }

    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUservicio() {
        return uservicio;
    }

    public void setUservicio(int uservicio) {
        this.uservicio = uservicio;
    }
    
    @Override
    public double calcularfactura(double x, double y) {
        double factura;
        factura=x*y;
        return factura;
    }

    @Override
    public String toString() {
        return "\t\tFACTURA"+
        "\nFECHA: "+this.fecha+
        "\nID CLIENTE: "+this.id+
        "\nUNIDADES DE SERVICIO: "+this.uservicio;
    }
}
