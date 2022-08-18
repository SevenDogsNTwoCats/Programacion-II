public class EmpleadosJardinero extends Empleados implements EmpleadosPagarInterfaz{
    private double yardast;
    private double yardap;

    public EmpleadosJardinero(String nombre, int edad, String genero, int telefono, double yardast, double yardap) {
        super(nombre, edad, genero, telefono);
        this.yardast = yardast;
        this.yardap = yardap;
    }

    public double getYardast() {
        return yardast;
    }

    public void setYardast(double yardast) {
        this.yardast = yardast;
    }

    public double getYardap() {
        return yardap;
    }

    public void setYardap(double yardap) {
        this.yardap = yardap;
    }

    @Override
    public double calcularfactura(double x,double y) {
        double factura;
        factura=x*y;
        return factura;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+getNombre()+
        "\nEdad: "+getEdad()+
        "\nGenero: "+getGenero()+
        "\nTelefono: "+getTelefono()+
        "\nYardas Trabajadas: "+this.yardast+
        "\nPrecio por Yarda: "+this.yardap+
        "\nFacturado: "+calcularfactura(yardap, yardast);
    }
}
