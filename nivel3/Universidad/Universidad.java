package nivel3.Universidad; //Se comenta para compilar

import java.util.Scanner;

public class Universidad {

    public static class Estudiante {

        public String nombre;
        public int edad;
        public double calificacion;
        public int contador = 9; // Contador para el array de estudiantes
        public Estudiante[] estudiantesArray = new Estudiante[10]; // Array para almacenar los estudiantes que lleguen y
                                                                   // para
                                                                   // usarlo en otros metodos

        Estudiante(String nombre, int edad, double calificacion) {
            this.nombre = nombre;
            this.edad = edad;
            this.calificacion = calificacion;
        }

        // Agrego un estudiante al array
        void agregarEstudiante(Estudiante[] estudiantes) {

            this.estudiantesArray = estudiantes;

            estudiantes[9] = new Estudiante(this.nombre, this.edad, this.calificacion);

            System.out.println("✅ Estudiante agregado correctamente");
        }

        void mostrarInfoEstudiantes() {
            for (int i = 0; i < estudiantesArray.length; i++) {

                if (estudiantesArray[i] != null) { // Evita errores si hay posiciones vacías
                    System.out.println(String.format("Estudiante: \n Nombre: %s,  Edad: %d, Calificacion: %.2f ",
                            estudiantesArray[i].nombre, estudiantesArray[i].edad, estudiantesArray[i].calificacion));
                }
            }
        }

        void calcularPromedioCalificaciones() {

            double sumaCalificaciones = 0;
            int cantidadEstudiantes = estudiantesArray.length;

            for (int i = 0; i < estudiantesArray.length; i++) {
                if (estudiantesArray[i] != null) { // Evita errores si hay posiciones vacías
                    sumaCalificaciones += estudiantesArray[i].calificacion;
                }
            }

            double promedio = sumaCalificaciones / cantidadEstudiantes;
            System.out.println(String.format("El promedio de las calificaciones es %.2f", promedio));

        }
    }

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