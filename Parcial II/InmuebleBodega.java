public class InmuebleBodega extends Inmueble {
    private double mconstruccion;
    private double mprecio;
    private String zona;
    public InmuebleBodega(String nmatricula, boolean disponible, double mconstruccion, double mprecio,String zona) {
        super(nmatricula, 0, disponible);
        this.mconstruccion = mconstruccion;
        this.mprecio = mprecio;
        this.zona = zona;
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
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }
    @Override
    protected void calcular() {
        if(zona=="A")
        setPrecio(2500);
        if(zona=="B")
        setPrecio(3200);
        if(zona=="C")
        setPrecio(3715);

        setPreciofinal(getPrecio()+mconstruccion*mprecio);
    }
    @Override
    public String toString() {
        return "\nMatricula: "+getNmatricula()+
                "\nZona: "+ zona+
                "\nMetros: "+ mconstruccion+
                "\nPrecio: "+Math.round(getPreciofinal()*100.0)/100.0+
                "\nDisponible: "+getDisponibilidad();
    }
    
}
