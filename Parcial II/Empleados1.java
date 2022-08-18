public abstract class Empleados1 {
    private String nombre;
    private String Apellido;
    private String nss;

    public Empleados1(String nombre, String apellido, String nss) {
        this.nombre = nombre;
        Apellido = apellido;
        this.nss = nss;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getNss() {
        return nss;
    }
    public void setNss(String nss) {
        this.nss = nss;
    }
     public void calcular(){
         //calcular salario total
     }
}
