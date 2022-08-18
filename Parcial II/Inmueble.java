public abstract class Inmueble {
    private String nmatricula;
    private double precio;
    private double preciofinal;
    private boolean disponible;
    private String disponibilidad;

    public Inmueble(String nmatricula, double precio, boolean disponible) {
        this.nmatricula = nmatricula;
        this.precio = precio;
        this.disponible = disponible;
        preciofinal=0;
        disponibilidad();
    }
    public String getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getNmatricula() {
        return nmatricula;
    }
    public void setNmatricula(String nmatricula) {
        this.nmatricula = nmatricula;
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
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    protected void disponibilidad(){
        if(disponible)
        disponibilidad="Si";
        else
        disponibilidad="No";
    }
    protected void calcular(){
        
    }
}
