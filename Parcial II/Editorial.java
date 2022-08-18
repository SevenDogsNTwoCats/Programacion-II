public abstract class Editorial {
    private String nombre;
    private float precio;

    protected Editorial(String nombre, float precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setprecio(float precio){
        this.precio=precio;
    }
    public float getprecio(){
        return this.precio;
    }
    public void datos(){
        System.out.println("\nTitulo: "+this.nombre +"\nPrecio: "+this.precio);
    }

}
