public class InmuebleCasa extends Inmueble {
    private double mconstruccion;
    private double mprecio;
    private String color;
    public InmuebleCasa(String nmatricula, boolean disponible, double mconstruccion, double mprecio,String color) {
        super(nmatricula, 0, disponible);
        this.mconstruccion = mconstruccion;
        this.mprecio = mprecio;
        this.color = color;
        calcular();
    }
    public double getMconstruccion() {
        return mconstruccion;
    }
    public void setMconstruccion(double mconstruccion) {
        this.mconstruccion = mconstruccion;
    }
    public double getMprecio() {
        return mprecio;
    }
    public void setMprecio(double mprecio) {
        this.mprecio = mprecio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    protected void calcular() {
        setPreciofinal(mconstruccion*mprecio);
    }
    @Override
    public String toString() {
        return "\nMatricula: "+getNmatricula()+
                "\nColor: "+ color+
                "\nMetros: "+ mconstruccion+
                "\nPrecio: "+Math.round(getPreciofinal()*100.0)/100.0+
                "\nDisponible: "+getDisponibilidad();
    }

    
}
