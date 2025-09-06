package nivel3.Libro2; //Se comenta para compilar

import java.util.Scanner;

public class Autor {

    public static class Libro2 {

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

    public static void main(String[] args) {
        String nombre;
        String nacionalidad;
        String libro;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del autor");
        nombre = input.nextLine();

        System.out.println("Ingrese la nacionalidad del autor");
        nacionalidad = input.nextLine();

        System.out.println("Ingrese el nombre del libro");
        libro = input.nextLine();

        Libro2 libroObjt = new Libro2(nombre, nacionalidad, libro);

        // Muestro la info del libro y su autor
        libroObjt.mostrarInfo();

        input.close();
    }

}
