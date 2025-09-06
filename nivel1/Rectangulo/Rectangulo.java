package nivel1.Rectangulo;

public class Rectangulo {

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
