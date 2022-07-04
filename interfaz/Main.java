public class Main {
    public static void main(String[] args) {
        AlumnoController alumnoController = new AlumnoController(2);
        System.out.println("Lista de Alumnos");
        alumnoController.create(null, 0, null, null);
        alumnoController.create("nombres", 12345, "apellidos", null);
        alumnoController.update();
        Docente docente = new Docente("nombres", 12365456, "apellidos", null, "grado", "titulo");
        docente.calcularEdad();
    }

}
