public class EmpleadosPorComision extends Empleados1{
    private double salario;
    private double ventas;
    private double comision;

    public EmpleadosPorComision(String nombre, String apellido, String nss, double ventas, double comision) {
        super(nombre, apellido, nss);
        this.ventas = ventas;
        this.comision = comision;
        calcular();
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getVentas() {
        return ventas;
    }
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }
    
    @Override
    public void calcular() {
        salario=ventas*comision;
    }
    @Override
    public String toString() {
        return "\nEmpleado Por Comision: "+ getNombre()+" "+getApellido()+
        "\nSegruro Social: "+getNss()+
        "\nSalario: " +Math.round(salario*100)/100;
    }
    
}
