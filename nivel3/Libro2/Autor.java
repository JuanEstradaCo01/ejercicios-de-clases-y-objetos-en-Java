package nivel3.Libro2;

import java.util.Scanner;

public class Autor {

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
