package nivel1.Coche;

public class Coche {

    public String marca;
    public int modelo;

    Coche(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void arrancar() {
        System.out.println(String.format("El coche está arrancando, es un %s modelo %d.", this.marca, this.modelo));
    }

}