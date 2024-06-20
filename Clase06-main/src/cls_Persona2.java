/*=================================================================================
Study Center....: Universidad Técnica Nacional
Campus..........: Pacífico (JRMP)
College career..: Ingeniería en Tecnologías de Información
Period..........: 2C-2024
Course..........: ITI-221 - Programación I
Document........: class_05 - cls_Persona.java
Goals...........: Use the ADT (Abstract Data Type) concept to create a class that
                  represents a person.
Professor.......: Jorge Ruiz (york)
Student.........: Michael Carranza Porras
======================================================================================*/
import java.util.Date;

public abstract class cls_Persona2
{
    // Private attributes
    private int cedula;
    private String nombre;
    private char sexo;
    private char eCivil;
    private Date fecNac;

    // Creates default constructor
    public cls_Persona2()
    {  }


    public cls_Persona2(int cedula, String nombre)
    {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public cls_Persona2(String nombre, int cedula)
    {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Creates parametrized constructor
    public cls_Persona2(int cedula, String nombre, char sexo, char eCivil, Date fecNac)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.eCivil = eCivil;
        this.fecNac = fecNac;
    }

    // Getters and Setters methods
    public int getCedula()
    {
        return this.cedula;
    }

    public void setCedula(int cedula)
    {
        this.cedula = cedula;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public char getSexo()
    {
        return this.sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public char geteCivil()
    {
        return this.eCivil;
    }

    public void seteCivil(char eCivil)
    {
        this.eCivil = eCivil;
    }

    public Date getFecNac()
    {
        return this.fecNac;
    }

    public void setFecNac(Date fecNac)
    {
        this.fecNac = fecNac;
    }

    public int getEdad()
    {
        return new Date().getYear() - this.fecNac.getYear();
    }

}