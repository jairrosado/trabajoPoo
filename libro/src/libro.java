public class libro {

        private String titulo;
        private String autor;
        private String isbn;

        public libro(String titulo, String autor, String isbn) {
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
        }

        public void leer() {
            System.out.println("Estás leyendo " + titulo + " de " + autor);
        }

        public void abrir() {
            System.out.println("Has abierto el libro " + titulo);
        }
}
