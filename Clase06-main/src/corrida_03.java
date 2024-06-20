/*=================================================================================
Study Center....: Universidad TÃ©cnica Nacional
Campus..........: PacÃ­fico (JRMP)
College career..: IngenierÃ­a en TecnologÃ­as de InformaciÃ³n
Period..........: 2C-2024
Course..........: ITI-221 - ProgramaciÃ³n I
Document........: class_05 - corrida_03.java
Goals...........: Create instances of the cls_Persona class and use its methods.
Professor.......: Jorge Ruiz (york)
Student.........:
=================================================================================*/
// Call external libraries
import java.util.Date;
import java.text.SimpleDateFormat;

public class corrida_03 {
    public static void main(String[] args){
        // Create an array of cls_Persona objects
        cls_Persona[] vecGente= new cls_Persona[100];

        // Create an instance of the functions class
        functions f = new functions();

        // Create an instance of the SimpleDateFormat class to format the date
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        // Create a collection of 100 cls_Persona objects
        for(int i=0; i < vecGente.length; i++){
            try {
                String fecha = f.fecNac();
                vecGente[i] = new cls_Persona(
                        f.Cedula(),
                        f.Nombre() + " " + f.Apellido() + " " + f.Apellido(),
                        f.Sexo(), f.estCivil(),
                        new Date(String.valueOf(formatoFecha.parse(fecha))));
            }catch (Exception exp){
                System.out.println(exp.getMessage());
                i-=1;
            }
        }
        System.out.println("ColecciÃ³n de personas creadas con Ã©xito");

        // Print the header of the table
        System.out.printf("%5s | %-10s | %-30s | %-4s | %-8s | %-30s\n","ID", "CÃ©dula", "Nombre Completo","Sexo", "E. Civil", "Nacido");
        System.out.println("------+------------+--------------------------------+------+----------+------------------------------");

        // Print 25 random people
        for (int i = 0; i < vecGente.length; i++) {
            System.out.printf("%5s | %-10s | %-30s | %-4s | %-8s | %-30s\n",
                    f.ponCeros(String.valueOf(i+1),5),
                    vecGente[i].getCedula(),
                    vecGente[i].getNombre(),
                    vecGente[i].getSexo(),
                    vecGente[i].geteCivil(),
                    vecGente[i].getFecNac());
        }
    }
}