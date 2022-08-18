public class EmpleadoComercial extends Empleado {
    private String tipo="Comercial";
    private double comision;
    
    public EmpleadoComercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    @Override
    protected void pago() {
        if(getEdad()>30&&comision>200)
        setPago(getSalario()+getBono());
        else
        setPago(getSalario());
    }
    @Override
    public String toString() {
        return  "\nTipo de Empleado: "+tipo+
                "\nNombre: " + getNombre()+
                "\nEdad: " + getEdad()+
                "\nComision " + getComision()+
                "\nSalario: "+ getPago();

    }

}
