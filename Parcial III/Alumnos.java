public class Alumnos {
    private String nombre;
    private String ncuenta;

    public Alumnos(String nombre, String ncuenta) {
        this.nombre = nombre;
        this.ncuenta = ncuenta;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    @Override
    public String toString() {
        return "\nNOMBRE: "+this.nombre+
                "\nNo. CUENTA: "+this.ncuenta;
    }
}
