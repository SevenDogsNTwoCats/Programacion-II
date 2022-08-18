public class SalarioEmpleadoComision extends SalarioEmpleado {
    private double comision;
    private double ventas;
    private double sueldo;
    public SalarioEmpleadoComision(String nombre, String apellido, int numeroseguro, double comision, double ventas) {
        super(nombre, apellido, numeroseguro);
        this.comision = comision;
        this.ventas=ventas;
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
    private void calcularsueldo(){
        this.sueldo=(this.ventas*this.comision)/100;
    }
    @Override
    public String toString() {
        calcularsueldo();
        return "-----------Empleado Por Comision-----------" +
                "\nNOMBRE: "+getnombre()+
                "\nAPELLIDO: "+getapellido()+
                "\nN* SEGURO: "+getnumeroseguro()+
                "\nSUELDO: "+this.sueldo;
    }
}
