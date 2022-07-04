import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Docente extends Persona {
    private String grado;
    private String titulo;
       Docente(String nombres, int dni, String apellidos, Date fechaNacimiento,String grado, String titulo) {
        super(nombres, dni, apellidos, fechaNacimiento);
        this.titulo = titulo;
        this.grado = grado;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void listarDocente(){
        System.out.println("Nombres y Apellidos de Docente: " + this.getNombres() + this.getApellidos());
        System.out.println("DNI de Docente: " + this.getDni());
        System.out.println("Grados y Titulos de Docente:" + this.getGrado() + this.getTitulo());
        System.out.println("---------------------------------------------");
    }
    @Override
    public void calcularEdad(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
        LocalDate ahora = LocalDate.now();
        
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años",
                            periodo.getYears());
    }
}
