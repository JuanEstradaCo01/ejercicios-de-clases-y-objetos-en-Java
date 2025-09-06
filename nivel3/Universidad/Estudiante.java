package nivel3.Universidad;

public class Estudiante {

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
                System.out.println(String.format("Estudiante: \n Nombre: %s,  Edad: %d, Calificacion: %f ",
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
        System.out.println("El promedio de las calificaciones es: " + promedio);

    }
}