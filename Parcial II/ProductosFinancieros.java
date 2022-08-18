public class ProductosFinancieros {
    private String tipo;
    private int nproducto;
    private double sminimo;
    private double tinteres;
    private double monto;
    private int lcredito;
    private double rendimiento;
    private boolean n=false;
    private String excedido;
    
    public ProductosFinancieros(int nproducto, double tinteres, double monto, int lcredito) {
        this.tipo="Targeta de credito";
        this.nproducto = nproducto;
        this.tinteres = tinteres;
        this.monto = monto;
        this.lcredito = lcredito;
        rendimientotargetacredito();
    }
    public ProductosFinancieros(int nproducto, double tinteres, double monto, double sminimo) {
        this.tipo="Cuenta bancaria";
        this.nproducto = nproducto;
        this.tinteres = tinteres;
        this.monto = monto;
        this.sminimo = sminimo;
        rendimientocuentabancaria();
    }

    public int getNproducto() {
        return nproducto;
    }
    public void setNproducto(int nproducto) {
        this.nproducto = nproducto;
    }
    public double getSminimo() {
        return sminimo;
    }
    public void setSminimo(double sminimo) {
        this.sminimo = sminimo;
    }
    public double getTinteres() {
        return tinteres;
    }
    public void setTinteres(double tinteres) {
        this.tinteres = tinteres;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public int getLcredito() {
        return lcredito;
    }
    public void setLcredito(int lcredito) {
        this.lcredito = lcredito;
    }
    
    public double getRendimiento() {
        return rendimiento;
    }
    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }
    private void rendimientotargetacredito(){
        if(monto>lcredito)
        rendimiento=Math.pow(lcredito*(1+tinteres),5);
        else{
            excedido="Ha excedido el limite de credito";
            n=true;
        }
    }
    private void rendimientocuentabancaria(){
        if(monto<=sminimo)
        rendimiento=monto*tinteres;
        else{
        excedido="No se cumplio el saldo minimo para aperturar la cuenta bancaria";
        n=true;
        }
    }
    @Override
    public String toString() {
        if(n)
        return "\n"+this.tipo+"\nNumero producto: "+nproducto+"\nTasa de interes: "+tinteres+"\nMonto: "+monto+"\nRendimiento: "+excedido;
            else
        return "\n"+this.tipo+"\nNumero producto: "+nproducto+"\nTasa de interes: "+tinteres+"\nMonto: "+monto+"\nRendimiento: "+Math.round(rendimiento*100.0)/100.0;
    }
    
}