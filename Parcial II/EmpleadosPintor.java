public class EmpleadosPintor extends Empleados implements EmpleadosPagarInterfaz{
    private double mpintados;
    private double pmpintado;
    private String pintura; 

    public EmpleadosPintor(String nombre, int edad, String genero, int telefono, double mpintados, double pmpintado,
            String pintura) {
        super(nombre, edad, genero, telefono);
        this.mpintados = mpintados;
        this.pmpintado = pmpintado;
        this.pintura = pintura;
    }

    public double getMpintados() {
        return mpintados;
    }

    public void setMpintados(double mpintados) {
        this.mpintados = mpintados;
    }

    public double getPmpintado() {
        return pmpintado;
    }

    public void setPmpintado(double pmpintado) {
        this.pmpintado = pmpintado;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
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
        "\nMetros pintados: "+this.mpintados+
        "\nPrecio por Metro Cuadrado pintado: "+this.pmpintado+
        "\nPintura: "+this.pintura+
        "\nFacturado: "+calcularfactura(mpintados, pmpintado);
    }
}
