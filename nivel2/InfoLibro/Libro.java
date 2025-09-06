package nivel2.InfoLibro;

public class Libro {

    String titulo;
    String autor;
    int paginas;

    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void mostrarInfo() {
        System.out.println(String.format("El libro '%s' tiene %d paginas y su autor es %s.", this.titulo, this.paginas,
                this.autor));
    }

}
