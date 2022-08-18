public class EmpleadosPorHora extends Empleados1 {
    private int horas;
    private double shora;
    private boolean textra;
    private double salario;
    public EmpleadosPorHora(String nombre, String apellido, String nss, int horas, double shora) {
        super(nombre, apellido, nss);
        this.horas = horas;
        this.shora = shora;
            setTextra(horas);
            calcular();
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getShora() {
        return shora;
    }
    public void setShora(double shora) {
        this.shora = shora;
    }
    public boolean isTextra() {
        return textra;
    }
    public void setTextra(int horas) {
        if(horas>40)
            this.textra=true;
    }
    @Override
    public void calcular() {
        if(textra){
            salario=horas*shora;
            salario+=salario*0.25;
        }
        else{
            salario=horas*shora;
        }
    }
    @Override
    public String toString() {
        return "\nEmpleado Por Hora: "+ getNombre()+" "+getApellido()+
        "\nSegruro Social: "+getNss()+
        "\nSalario: " +Math.round(salario*100)/100;
    }
    
}
