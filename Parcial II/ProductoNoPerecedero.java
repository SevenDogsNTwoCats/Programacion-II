public class ProductoNoPerecedero extends Producto {
    private String tipo="No";

    public ProductoNoPerecedero(String nombre, double precio) {
        super(nombre, precio);
        calcular();
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected void calcular() {
        setPreciofinal(getPrecio());
    }
    @Override
    public String toString() {
        return getNombre() +"\t\t"+tipo+"\t\t"+Math.round(getPrecio()*100.0)/100.0+"\t\t"+"N/A"+"\t\t   "+Math.round(getPreciofinal()*100.0)/100.0;
    }
    
}
