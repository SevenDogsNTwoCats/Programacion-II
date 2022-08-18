public class Vehiculo {
    boolean encender;
    boolean aceleracion;
    double acelerar;
    int velocidadactual;
    String girar;
    boolean retroceder;
    Boolean apagar;

    public Vehiculo(boolean encender, boolean aceleracion,int velocidadactual, String girar,boolean retroceder, boolean apagar){
        this.encender=encender;
        this.aceleracion=aceleracion;
        this.velocidadactual=velocidadactual;
        this.retroceder=retroceder;
        this.girar=girar;
        this.apagar=apagar;
    }

    public void setencerder(boolean encender){
        this.encender=encender;
    }
    public String getencender(){
        if(this.encender)
            return "El vehiculo esta encendido";
        else
        return "EL vehiculo esta apagado";
    }

    public void setaceleracion(boolean aceleracion){
        if(encender){
        this.aceleracion=aceleracion;
        this.acelerar= Math.random()*30+20;
        this.velocidadactual+=this.acelerar;
        }
    }
    public String getaceleracion(){
        if(encender)
        return "La velocidad actual es " + this.velocidadactual;
        else
        return "El auto se encuentra apagado";
    }

    public void setgirar(String girar){
        this.girar=girar;
    }
    public String getgirar(){
        if(this.encender)
            return "El auto se ha girado a la "+this.girar;
        else
            return "El auto se encuentra apagado";
    }

    public void setretroceder(Boolean retroceder){
        this.retroceder=retroceder;
        this.velocidadactual=15;
    }
    public String getretroceder(){
        if(encender)
            if(retroceder)
                return "El auto esta retrocediendo";
            else
                return"";
        else 
            return "El auto se encuentra apagado";

    }

    public void setapagar(Boolean apagar){
        this.apagar=apagar;
    }
    public String getapagar(){
        if(this.encender)
            if(this.apagar)
                return "El auto se ha apagado";
            else
                return "";
        else
            return "El auto se encuentra apagado";
    }
}