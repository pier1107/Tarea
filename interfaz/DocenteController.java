public class DocenteController {
    private Docente[] docentes;
    private int contador;
    DocenteController(int size){
        this.docentes = new Docente[size];
        this.contador = 0 ;
    }
    public void setDocente(Docente docente) {

        this.docentes[this.contador++] = docente;
    }
}
