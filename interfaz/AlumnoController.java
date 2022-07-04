import java.sql.Date;

public class AlumnoController implements Crud {
    private Alumno[] alumnos;
    private int contador;
    public AlumnoController(int size)
    {
        this.alumnos = new Alumno[size];

        this.contador = 0;
    }
    public void setAlumno(Alumno alumno) {

        this.alumnos[this.contador++] = alumno;
    }

    @Override
    public void create(String nombres, int dni, String apellidos, Date fechaNacimiento ) {
        this.alumnos[this.contador] = new Alumno(nombres, dni, apellidos, fechaNacimiento);

        this.contador++;

    }

    @Override
    public Alumno[] listar() {
        return this.alumnos;
    }
    @Override
    public void update() {

        for(Alumno i : alumnos){
            i.listarAlumno();
            }
        }
    @Override
    public Integer delete(int dni) {
        return dni;
    }

}
