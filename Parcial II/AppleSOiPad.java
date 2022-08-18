public class AppleSOiPad extends AppleSO implements AppleInterfaz{
    private String descripcionChip;
    enum modos{
        NOCTURNO,NORMAL;
    }
    modos modo;

    public AppleSOiPad(double version, String firmware, String wifi_address, String imei, String eid,
        String descripcionChip) {
        super(version, firmware, wifi_address, imei, eid);
        this.descripcionChip = descripcionChip;
    }
    public String getDescripcionChip() {
        return descripcionChip;
    }
    public void setDescripcionChip(String descripcionChip) {
        this.descripcionChip = descripcionChip;
    }

    @Override
    public void encender() {
        System.out.println("Apagando iPad");
    }
    @Override
    public void reiniciar() {
        System.out.println("Reiniciando iPad");
    }

    public void modo(int m){
        if(m==1)
            this.modo=modos.NOCTURNO;
        else
            this.modo=modos.NORMAL;

        System.out.println(modo);
    }

    @Override
    public void reproducirCancion() {
        System.out.println("Reproduciendo Cancion");
    }
    @Override
    public String toString() {
        return "Informacion iPAD"+"\nversion: "+getVersion()+
        "\nfirmware: "+getFirmware()+
        "\nwifi_address: "+getWifi_address()+
        "\nIMEI: "+getImei()+
        "\nEID: "+getEid();
    }
}
