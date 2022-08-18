public class Lavadora {
    boolean encendido;
    String carga;
    int piezas;
    boolean Detergente;
    boolean compatibilidad;
    String tipolavado;
//constructor
    public Lavadora(boolean encendio,String carga,int piezas,String tipolavado){
        this.encendido=encendio;
        this.carga=carga;
        this.piezas=piezas;
        this.tipolavado=tipolavado;
        this.compatibilidad=false;
        this.Detergente=false;
    }
//encendido
    public void Setencendio(boolean encendido){
        this.encendido=encendido;        
    }
    public String getencendido(){
        if(encendido)
        return "Encendida";
        else
        return "Apagada";
    }
    public void Setcarga(String carga){
        this.carga=carga;        
    }
    public String getcarga(){
        return this.carga;
    }
    public void Setpiezas(int piezas){
        this.piezas=piezas;     
     
    }  
    public int getpieza(){ 
        return this.piezas;        
    } 
    public void compatible(){
        if(this.carga.equals("Pequena") && this.piezas<=10){
            this.compatibilidad=true;
        }
        if(this.carga.equals("Mediana") && (this.piezas>10&&this.piezas<=15)){
           this.compatibilidad =true;
        }
        if(this.carga.equals("Grande") && (this.piezas>=15&&this.piezas<=20)){
           this.compatibilidad =true;
        }
    }
    //compatibilidad piezas y carga
    public String getcompatibilidad(){
        if(!compatibilidad)
        return "La carga y la cantidad de piezas no son compatibles";
        else
        return "La cantidad de piezas para la carga es la correcta";
    }
    
    public void Settipolavado(String tipolavado){
        this.tipolavado=tipolavado;        
    }
    public void Detergente(){
        this.Detergente=true;
    }
    public String getDetergente(){
        if(this.Detergente)
        return "Se ha agregado Detergente";
        else
        return "";
    }
    
    public String Iniciar(){
        if(this.Detergente && this.compatibilidad)
        return "Se ha inciado el lavado";
        else
        return "No se ha iniciado el lavado";
    }
}
