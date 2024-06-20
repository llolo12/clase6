public class cls_Grupo {

    private cls_Profesor profe;

    private cls_Estudiante[] alumnos;
    private String Nombre;

    public cls_Grupo(cls_Profesor profe, cls_Estudiante[] alumnos, String nombre) {
        this.profe = profe;
        this.alumnos = alumnos;
        Nombre = nombre;
    }

    public cls_Grupo() {
    }

    public cls_Grupo(cls_Profesor profe, cls_Estudiante[] alumnos) {
        this.profe = profe;
        this.alumnos = alumnos;
    }

    public cls_Profesor getProfe() {
        return profe;
    }

    public void setProfe(cls_Profesor profe) {
        this.profe = profe;
    }

    public cls_Estudiante[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(cls_Estudiante[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
