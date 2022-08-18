public class AppleRun {
    public static void main(String[] args) {
        AppleSOiPad ipad=new AppleSOiPad( 128181.2321, "IDSJ-23921091-21232", "218901-2329-21", "90-22DJE-2321","SKJDW92100911", "IDPSA281291912982181291291");
        AppleSOiPhone13 iphone=new AppleSOiPhone13(21879821739.1290101, "JKDKJAS2-23KS-33JJS-22991", "829JSYESJSA9128", "8218289-WEJW21-2123S", "82JWSAFADA82RQQ");
        AppleSOiPodTouch ipod=new AppleSOiPodTouch(234, 56370, 102);

        //USANDO iPOD
        //inf
        System.out.println("USANDO iPOD");
        System.out.println(ipod);
        //reproducir cancion
        ipod.reproducirCancion();
        System.out.println("------------------------------------------------------------------");
        //USANDO iPAD
        //inf
        System.out.println("USANDO iPAD");
        System.out.println(ipad);
        //chip
        System.out.println("informacion CHIP: "+ipad.getDescripcionChip());
        //FUNCIONES
        System.out.println("Funciones");
        //poner modo oscuro
        ipad.modo(1);
        //reproducir cancion
        ipad.reproducirCancion();
        //reiniciar, encender bluetooth, encender wifi, y apagar
        ipad.reiniciar();
        ipad.bluetooth("encender");
        ipad.wifi("encender");
        ipad.encender();
        System.out.println("------------------------------------------------------------------");
        //USANDO iPHONE
        System.out.println("USANDO iPHONE");
        System.out.println(iphone);
        //FUNCIONES
        System.out.println("Funciones");
        //reproducir cancion
        iphone.reproducirCancion();
        //reiniciar, encender bluetooth, encender wifi, y apagar
        iphone.reiniciar();
        iphone.bluetooth("encender");
        iphone.wifi("encender");
        iphone.encender();
    }
}
