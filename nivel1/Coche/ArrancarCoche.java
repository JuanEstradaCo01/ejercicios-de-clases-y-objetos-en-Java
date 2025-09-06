package nivel1.Coche;

import java.util.Scanner;

public class ArrancarCoche {

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
