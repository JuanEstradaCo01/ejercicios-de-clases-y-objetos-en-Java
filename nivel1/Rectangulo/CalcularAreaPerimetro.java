package nivel1.Rectangulo;

import java.util.Scanner;

public class CalcularAreaPerimetro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int base;
        int altura;

        System.out.println("Ingrese la base del rectangulo");
        base = input.nextInt();

        System.out.println("Ingrese la altura del rectangulo");
        altura = input.nextInt();

        // Envio los valores al constructor de la clase Rectangulo
        Rectangulo rectangulo = new Rectangulo(base, altura);

        // Calculo area
        rectangulo.area();

        // Calculo perimetro
        rectangulo.perimetro();

        input.close();
    }

}
