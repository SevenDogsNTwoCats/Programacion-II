public class InmuebleApartamento extends Inmueble {
    private int npiso;

    public InmuebleApartamento(String nmatricula, double precio, boolean disponible, int npiso) {
        super(nmatricula, precio, disponible);
        this.npiso = npiso;
        calcular();
    }

    public int getNpiso() {
        return npiso;
    }

    public void setNpiso(int npiso) {
        this.npiso = npiso;
    }
    
    protected void calcular() {
        setPreciofinal(getPrecio()+1000*(npiso-1));
    }
    @Override
    public String toString() {
        return "\nMatricula: "+getNmatricula()+
                "\nPiso: "+ npiso+
                "\nPrecio: "+Math.round(getPreciofinal()*100.0)/100.0+
                "\nDisponible: "+getDisponibilidad();
    }
}
