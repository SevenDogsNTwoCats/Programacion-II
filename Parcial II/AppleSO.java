public abstract class AppleSO {
    //SO anterior
    private double version;
    private String firmware;
    private String wifi_address;
    //SO nuevo
    private String imei;
    private String eid;
    
    public AppleSO(double version, String firmware, String wifi_address, String imei, String eid) {
        this.version = version;
        this.firmware = firmware;
        this.wifi_address = wifi_address;
        this.imei = imei;
        this.eid = eid;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public String getWifi_address() {
        return wifi_address;
    }

    public void setWifi_address(String wifi_address) {
        this.wifi_address = wifi_address;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }
    //funcionalidades
     public void bluetooth(String x){
        if (x=="encender") {
            System.out.println("Bluetooth encendido");
        }
        else
            System.out.println("Bluetooth apagado");
     }
     public void wifi(String x){
        if (x=="encender") {
            System.out.println("Wi-fi encendido");
        }
        else
            System.out.println("Wi-fi apagado");
     }
     //METODOS COMUN
     public abstract void encender();
     public abstract void reiniciar();
}
