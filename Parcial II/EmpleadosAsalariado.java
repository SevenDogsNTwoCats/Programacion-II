public class EmpleadosAsalariado extends Empleados1{
    private double salario;

    public EmpleadosAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nEmpleado Asalariado: "+ getNombre()+" "+getApellido()+
                "\nSegruro Social: "+getNss()+
                "\nSalario: " +Math.round(salario*10)/10;
    }
}
