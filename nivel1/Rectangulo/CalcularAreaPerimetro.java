package nivel1.Rectangulo; //Se comenta para compilar

import java.util.Scanner;

public class CalcularAreaPerimetro {

    public static class Rectangulo {

        public int base;
        public int altura;

        Rectangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }

        void area() {
            int area = this.base * this.altura;

            System.out.println(String.format("El área del rectángulo es: %d", area));
        }

        void perimetro() {
            int perimetro = 2 * (this.base + this.altura);
            System.out.println(String.format("El perímetro del rectángulo es: %d", perimetro));
        }

    }

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
