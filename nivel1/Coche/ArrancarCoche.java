package nivel1.Coche; //Se comenta para compilar

import java.util.Scanner;

public class ArrancarCoche {

    public static class Coche {

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

    // Clase MAIN
    public static void main(String[] args) {

        String marca;
        int modelo;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la marca del vehiculo");
        marca = input.nextLine();

        System.out.println("Ingrese el modelo del vehiculo");
        modelo = input.nextInt();

        Coche carro = new Coche(marca, modelo);
        carro.arrancar();
        input.close();
    }

}
