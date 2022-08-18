public class EmpleadoRepartidor extends Empleado {
    private String tipo="Repartidor";
    private String zona;

    public EmpleadoRepartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    protected void pago() {
        if(getEdad()<25&&zona=="Zona 3")
        setPago(getSalario()+getBono());
        else
        setPago(getSalario());
    }
    @Override
    public String toString() {
        return  "\nTipo de Empleado: "+tipo+
                "\nNombre: " + getNombre()+
                "\nEdad: " + getEdad()+
                "\nZona: " + getZona()+
                "\nSalario: "+ getPago();

    }
}
