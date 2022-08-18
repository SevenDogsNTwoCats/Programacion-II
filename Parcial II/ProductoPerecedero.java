public class ProductoPerecedero extends Producto {
    private String tipo="Si";
    private int diascaducar;
    
    public ProductoPerecedero(String nombre, double precio, int diascaducar) {
        super(nombre, precio);
        this.diascaducar = diascaducar;
        calcular();
    }
    public int getDiascaducar() {
        return diascaducar;
    }
    public void setDiascaducar(int diascaducar) {
        this.diascaducar = diascaducar;
    }
    @Override
    protected void calcular() {
        if(getDiascaducar()==1)
        setPreciofinal(getPrecio()/4);
        if(getDiascaducar()==2)
        setPreciofinal(getPrecio()/3);
        if(getDiascaducar()==3)
        setPreciofinal(getPrecio()/2);
        if(getDiascaducar()>3)
        setPreciofinal(getPrecio());
    }
    @Override
    public String toString() {
        return getNombre() +"\t\t"+tipo+"\t\t"+Math.round(getPrecio()*100.0)/100.0+"\t\t"+diascaducar+"\t\t   "+Math.round(getPreciofinal()*10.0)/10.0;
    }
}
