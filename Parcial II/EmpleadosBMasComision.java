public class EmpleadosBMasComision extends Empleados1 {
    private double salario;
    private double comision;
    private double ventas;
    private double sueldo;
    
    public EmpleadosBMasComision(String nombre, String apellido, String nss, double comision, double ventas,
            double sueldo) {
        super(nombre, apellido, nss);
        this.comision = comision;
        this.ventas = ventas;
        this.sueldo = sueldo;
        calcular();
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }
    public double getVentas() {
        return ventas;
    }
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public void calcular() {
        salario=sueldo+ventas*comision;
    }
    @Override
    public String toString() {
        return "\nEmpleado Sueldo Base Mas Comision: "+ getNombre()+" "+getApellido()+
        "\nSegruro Social: "+getNss()+
        "\nSalario: " +Math.round(salario*100)/100;
    }
}
