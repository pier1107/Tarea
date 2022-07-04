import java.sql.Date;

public interface Crud {
    public void create(String nombres, int dni, String apellidos, Date fechaNacimiento);
    public Alumno[] listar();
    public void update();
    public Integer delete(int dni);
}
