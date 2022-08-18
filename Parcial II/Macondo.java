abstract class Macondo {
    private int id;
    private String Nombre;
    private double ingreso;
    public Macondo(int id, String nombre) {
        this.id = id;
        Nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getIngreso() {
        return ingreso;
    }
    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }
}
