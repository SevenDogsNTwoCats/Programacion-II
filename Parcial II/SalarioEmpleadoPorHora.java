public class SalarioEmpleadoPorHora extends SalarioEmpleado{
    private int horas;
    private double sueldohora;
    private double sueldo;
    public SalarioEmpleadoPorHora(String nombre, String apellido, int numeroseguro, int horas, double sueldohora) {
        super(nombre, apellido, numeroseguro);
        this.horas = horas;
        this.sueldohora = sueldohora;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getSueldohora() {
        return sueldohora;
    }
    public void setSueldohora(double sueldohora) {
        this.sueldohora = sueldohora;
    }
    private void calcularsueldo(){
        this.sueldo=this.sueldohora*this.horas;
    }
    @Override
    public String toString() {
        calcularsueldo();
        return "-------------Empleado Por Hora-------------" +
                "\nNOMBRE: "+getnombre()+
                "\nAPELLIDO: "+getapellido()+
                "\nN* SEGURO: "+getnumeroseguro()+
                "\nSUELDO: "+this.sueldo;
    }
}