
import java.sql.Date;

public class Alumno extends Persona {

    Alumno(String nombres, int dni, String apellidos, Date fechaNacimiento) {
        super(nombres, dni, apellidos, fechaNacimiento);

    }
    public void listarAlumno(){
        System.out.println("Nombres y Apellidos de Alumno: " + this.getNombres() + this.getApellidos());
        System.out.println("DNI de Alumno: " + this.getDni());
        System.out.println("---------------------------------------------");
    }
    @Override
    public void calcularEdad(){
        public int edad;
        edad = 2022 - getDni();
        System.out.println("Su edad es:" +edad);

    }

}
