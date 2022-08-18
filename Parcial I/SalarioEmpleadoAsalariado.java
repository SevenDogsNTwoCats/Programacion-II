public class SalarioEmpleadoAsalariado extends SalarioEmpleado{

    private double sueldofijo;

    public SalarioEmpleadoAsalariado(String nombre, String apellido, int numeroseguro, double sueldofijo){
        super(nombre, apellido, numeroseguro);
        this.sueldofijo=sueldofijo;
    }

    public double getSueldofijo() {
        return sueldofijo;
    }

    public void setSueldofijo(double sueldofijo) {
        this.sueldofijo = sueldofijo;
    }
    
    @Override
    public String toString() {
        return "------------Empleado Asalariado------------" +
                "\nNOMBRE: "+getnombre()+
                "\nAPELLIDO: "+getapellido()+
                "\nN* SEGURO: "+getnumeroseguro()+
                "\nSUELDO: "+getSueldofijo();
    }
}