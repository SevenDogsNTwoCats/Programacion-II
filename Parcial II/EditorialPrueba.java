public class EditorialPrueba {
    public static void main (String arg[]){
        EditorialLibro libro1 = new EditorialLibro("El principito",144.5f,200);
        EditorialAudioLibro libro2 = new EditorialAudioLibro("Como Programar en Java",230.7f,720);
        libro1.datos();
        libro2.datos();
    }
}
