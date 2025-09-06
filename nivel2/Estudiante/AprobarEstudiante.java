package nivel2.Estudiante; //Se comenta para compilar

public class AprobarEstudiante {

    public static class Estudiante {

        String nombre;
        int matricula;
        double calificacion;

        Estudiante(String nombre, int matricula, double calificacion) {
            this.nombre = nombre;
            this.matricula = matricula;
            this.calificacion = calificacion;
        }

        void calificar() {
            if (this.calificacion >= 6) {
                System.out.println(
                        String.format("✅ El estudiante %s ha aprobado con una calificación de %.2f", this.nombre,
                                this.calificacion));
            } else {
                System.out
                        .println(String.format("⛔ El estudiante %s no ha aprobado, con una calificación de %.2f",
                                this.nombre, this.calificacion));
            }
        }

    }

    public static void main(String[] args) {

        // Agrego varios estudiantes ya predefinidos
        Estudiante estudiante1 = new Estudiante("Juan", 12345, 7.3);
        Estudiante estudiante2 = new Estudiante("María", 67857, 5.5);
        Estudiante estudiante3 = new Estudiante("Pedro", 67812, 5.9);
        Estudiante estudiante4 = new Estudiante("Elkin", 67340, 6);
        Estudiante estudiante5 = new Estudiante("Fernando", 65890, 8.2);

        estudiante1.calificar();
        estudiante2.calificar();
        estudiante3.calificar();
        estudiante4.calificar();
        estudiante5.calificar();
    }

}
