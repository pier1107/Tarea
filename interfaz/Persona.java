import java.sql.Date;

public abstract class Persona{
    protected String nombres;
    protected int dni;
    protected String apellidos;
    protected Date fechaNacimiento;

Persona(String nombres, int dni, String apellidos, Date fechaNacimiento){
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.dni = dni;
    this.fechaNacimiento= fechaNacimiento;
}
public String getApellidos() {
    return apellidos;
}
public int getDni() {
    return dni;
}
public String getNombres() {
    return nombres;
}
public Date getFechaNacimiento() {
    return fechaNacimiento;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}
public void setDni(int dni) {
    this.dni = dni;
}
public void setNombres(String nombres) {
    this.nombres = nombres;
}
public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}
public void calcularEdad(){
    return;
}
}