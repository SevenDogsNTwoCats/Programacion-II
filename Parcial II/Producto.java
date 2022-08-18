public abstract class Producto {
    private String nombre;
    private double precio;
    private double preciofinal;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPreciofinal() {
        return preciofinal;
    }
    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    protected void calcular(){}
}
