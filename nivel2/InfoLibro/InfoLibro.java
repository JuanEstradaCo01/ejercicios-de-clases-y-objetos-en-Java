package nivel2.InfoLibro; //Se comenta para compilar

public class InfoLibro {

    public static class Libro {

        String titulo;
        String autor;
        int paginas;

        Libro(String titulo, String autor, int paginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        }

        void mostrarInfo() {
            System.out.println(
                    String.format("El libro '%s' tiene %d paginas y su autor es %s.", this.titulo, this.paginas,
                            this.autor));
        }

    }

    // Clase MAIN
    public static void main(String[] args) {

        // Creo varios libros ya predefinidos
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);
        Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 576);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
    }

}
