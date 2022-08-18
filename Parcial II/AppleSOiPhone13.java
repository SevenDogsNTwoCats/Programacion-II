public class AppleSOiPhone13 extends AppleSO implements AppleInterfaz{

    public AppleSOiPhone13(double version, String firmware, String wifi_address, String imei, String eid) {
        super(version, firmware, wifi_address, imei, eid);
    }
    @Override
    public void encender() {
        System.out.println("Apagando iPhone");
    }
    @Override
    public void reiniciar() {
        System.out.println("Reiniciando iPhone");
    }

    @Override
    public void reproducirCancion() {
        System.out.println("Reproduciendo Cancion");
    }
    @Override
    public String toString() {
        return "Informacion iPHONE"+"\nversion: "+getVersion()+
        "\nfirmware: "+getFirmware()+
        "\nwifi_address: "+getWifi_address()+
        "\nIMEI: "+getImei()+
        "\nEID: "+getEid();
    }
}
