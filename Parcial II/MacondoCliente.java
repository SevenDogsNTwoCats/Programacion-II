public class MacondoCliente extends Macondo implements MacondoInterfaz {
    private String direcion;
    private String correo;
    private String telefono;
    private int n_articulos;
    private double p_unitario;
    public MacondoCliente(int id, String nombre, String direcion, String correo, String telefono, int n_articulos,double p_unitario) {
        super(id, nombre);
        this.direcion = direcion;
        this.correo = correo;
        this.telefono = telefono;
        this.p_unitario=p_unitario;
        this.n_articulos=n_articulos;
        calcularIngreso(n_articulos,p_unitario);
    }
    public String getDirecion() {
        return direcion;
    }
    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }
    public int getN_articulos() {
        return n_articulos;
    }
    public void setN_articulos(int n_articulos) {
        this.n_articulos = n_articulos;
    }
    public double getP_unitario() {
        return p_unitario;
    }
    public void setP_unitario(double p_unitario) {
        this.p_unitario = p_unitario;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public void calcularIngreso(int a, double b) {
        setIngreso(a*b);
    }
    @Override
    public String toString() {
        return "\nID Cliente: "+getId()+
        "\nNombre: " + getNombre()+
        "\nDireccion: "+direcion+
        "\nCorreo: "+correo+
        "\nTelefono:"+telefono+
        "\nIngresos: "+getIngreso();
    }
}
