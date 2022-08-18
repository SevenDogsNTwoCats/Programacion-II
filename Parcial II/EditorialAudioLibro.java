
    public class EditorialAudioLibro extends Editorial{
    
            private int minutos;
            
            public EditorialAudioLibro(String nombre, float precio, int minutos){
                super(nombre,precio);
                this.minutos=minutos;
            }
            public void setminutos(int minutos){
                this.minutos=minutos;
            }
            public int getminutos(){
                return this.minutos;
            }
        @Override
        public void datos(){
            System.out.println("\n\tAudio Libro\nTitulo: "+getnombre() +"\nPrecio: "+getprecio()+"\nMinutos: " + this.minutos);
        }
    }
    
