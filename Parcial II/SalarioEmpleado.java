public abstract class SalarioEmpleado {
    private String nombre;
    private String apellido;
    private int numeroseguro;

    public SalarioEmpleado(String nombre, String apellido,int numeroseguro){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroseguro=numeroseguro;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public int getnumeroseguro() {
        return numeroseguro;
    }

    public void setnumeroseguro(int numeroseguro) {
        this.numeroseguro = numeroseguro;
    }
    
}
