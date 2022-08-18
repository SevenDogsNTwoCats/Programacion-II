public class SalarioEmpleadoBaseComision extends SalarioEmpleado {
    private double sueldobase;
    private double sueldo;
    private double comision;
    private double ventas;
    public SalarioEmpleadoBaseComision(String nombre, String apellido, int numeroseguro, double sueldobase, double comision, double ventas) {
        super(nombre, apellido, numeroseguro);
        this.sueldobase = sueldobase;
        this.comision = comision;
        this.ventas = ventas;
    }
    public double getSueldobase() {
        return sueldobase;
    }
    public void setSueldo(double sueldobase) {
        this.sueldo = sueldobase;
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
        this.sueldo=this.sueldobase+(this.ventas*this.comision)/100;
    }
    @Override
    public String toString() {
        calcularsueldo();
        return "-----Empleado Sueldo Base mas Comision------" +
                "\nNOMBRE: "+getnombre()+
                "\nAPELLIDO: "+getapellido()+
                "\nN* SEGURO: "+getnumeroseguro()+
                "\nSUELDO: "+this.sueldo;
    }
    
}
