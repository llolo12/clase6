import java.util.Date;

public class corrida_02
{
    public  static void main(String[] args)
    {

        cls_Persona per1 = new cls_Persona();

        per1.setCedula(103450754);
        per1.setNombre("Morticia Addams Frug");
        per1.setSexo('F');
        per1.seteCivil('C');
        per1.setFecNac(new Date("08/07/1970"));

        System.out.println("Nombre...: " + per1.getNombre());
        System.out.println("Nacida...: " + per1.getFecNac());
        System.out.println("Edad.....: " + per1.getEdad());
        System.out.println("Sexo...: " + per1.getSexo());
        System.out.println("Estado civil...: " + per1.geteCivil());

        cls_Persona per2 = new cls_Persona(12344,
                "Merlina Addams",
                'F',
                'S',
                new Date ("10/10/1960"));

    }
}