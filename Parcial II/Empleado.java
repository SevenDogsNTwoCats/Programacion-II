public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private int bono=3500;
    private double pago;
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getBono() {
        return this.bono;
    }
    public double getPago() {
        pago();
        return pago;
    }
    public void setPago(double pago) {
        this.pago = pago;
    }
    protected void pago(){
    }
}
