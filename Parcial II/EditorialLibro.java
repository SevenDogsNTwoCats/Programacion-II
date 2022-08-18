    public class EditorialLibro extends Editorial{

        private int npaginas;

        public EditorialLibro(String nombre, float precio, int npaginas){
            super(nombre,precio);
            this.npaginas=npaginas;
        }
        public void setnpaginas(int npaginas){
            this.npaginas=npaginas;
        }
        public int getnpaginas(){
            return this.npaginas;
        }
        @Override
        public void datos(){
            System.out.println("\n\tLibro\nTitulo: "+getnombre() +"\nPrecio: "+getprecio()+"\nPaginas: " + this.npaginas);
        }
    }

