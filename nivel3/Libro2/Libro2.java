package nivel3.Libro2;

public class Libro2 {

    public String nombre;
    public String nacionalidad;
    public String libro;

    Libro2(String nombre, String nacionalidad, String libro) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.libro = libro;
    }

    void mostrarInfo() {
        System.out.println(String.format("El autor %s es de nacionalidad (%s) y su libro es %s", this.nombre,
                this.nacionalidad, this.libro));
    }
}
