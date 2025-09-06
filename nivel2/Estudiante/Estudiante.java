package nivel2.Estudiante;

public class Estudiante {

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
            System.out.println(String.format("✅ El estudiante %s ha aprobado con una calificación de %.2f", this.nombre,
                    this.calificacion));
        } else {
            System.out
                    .println(String.format("⛔ El estudiante %s no ha aprobado, con una calificación de %.2f",
                            this.nombre, this.calificacion));
        }
    }

}
