package nivel3.Universidad;

import java.util.Scanner;

public class Universidad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        double calificacion;

        // Declaro el array de objetos usando la clase Estudiante (con un maximo de 10
        // estudiantes)
        Estudiante[] estudiantes = new Estudiante[10];

        // Array de estudiantes predefinidos
        estudiantes[0] = new Estudiante("Ana", 22, 7.8);
        estudiantes[1] = new Estudiante("Luis", 25, 6.5);
        estudiantes[2] = new Estudiante("Carlos", 24, 8.2);
        estudiantes[3] = new Estudiante("Marta", 23, 9.0);
        estudiantes[4] = new Estudiante("Sofía", 26, 5.4);
        estudiantes[5] = new Estudiante("Jorge", 25, 6.9);
        estudiantes[6] = new Estudiante("Lucía", 19, 8.5);
        estudiantes[7] = new Estudiante("Diego", 23, 7.2);
        estudiantes[8] = new Estudiante("Elena", 22, 9.1);

        System.out.println("Ingrese el nombre del estudiante");
        nombre = input.nextLine();

        System.out.println("Ingrese la edad del estudiante");
        edad = input.nextInt();

        System.out.println("Ingrese la calificacion del estudiante");
        calificacion = input.nextDouble();

        // Envio los datos al constructor de la clase Estudiante
        Estudiante estudiante = new Estudiante(nombre, edad, calificacion);

        // Agrego estudiante
        estudiante.agregarEstudiante(estudiantes);

        // Muestro los estudiantes
        estudiante.mostrarInfoEstudiantes();

        // Calculo el promedio de las calificaciones de los estudiantes
        estudiante.calcularPromedioCalificaciones();

        input.close();

    }

}