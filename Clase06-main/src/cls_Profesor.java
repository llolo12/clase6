public class cls_Profesor extends cls_Persona2 {
    // Private attributes
    private String Especialidad;
    private String Titulo;

    // Creates default constructor
    public cls_Profesor() {
    }

    // Creates parametrized constructor
    public cls_Profesor(int cedula, String Nombre, String Especialidad, String Titulo) {
        // Calls the constructor of the superclass
        this.setCedula(cedula);
        this.setNombre(Nombre);

        // Initializes the attributes of the subclass
        this.Especialidad = Especialidad;
        this.Titulo = Titulo;
    }

      public String getEspecialidad() {
        return this.Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    // Create destructor method
    protected void finalize () {
        System.out.println("El profesor con cÃ©dula " + this.getCedula() + "ha sido removido de memoria");
    }

}