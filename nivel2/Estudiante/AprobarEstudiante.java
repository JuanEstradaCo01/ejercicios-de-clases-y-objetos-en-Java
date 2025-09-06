package nivel2.Estudiante;

public class AprobarEstudiante {

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
