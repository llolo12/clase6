public class corrida_04 {
    public static void main(String[] args) {
        // Creates a new object of the cls_Profesor class
        cls_Profesor profesor = new cls_Profesor(123456, "Jorge Ruiz", "Bases de Datos", "Master");

        // Displays the attributes of the object
        System.out.println("CÃ©dula: " + profesor.getCedula());
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Especialidad: " + profesor.getEspecialidad());
        System.out.println("TÃ­tulo: " + profesor.getTitulo());

        // Calls the finalize method
        profesor = null;
        System.gc();
    }
}