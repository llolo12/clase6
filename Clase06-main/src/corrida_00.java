/*======================================================================================
Study Center....: Universidad Tecnica Nacional
Campus..........: Pacífico (JRMP)
College career..: Ingeniería en Tecnologias de Información
Period..........: 2C-2024
Course..........: ITI-221 - Programación 1
Document........: class_06 - corrida_01.java
Goals...........: Use the try...catch sentence to avoid the program crash.
Professor.......: Jorge Ruiz (york)
Student.........: Michael Carranza Porras
======================================================================================
----------------------( in the past )-----------------------
If you fail to plan,
you are planning to fail.
              (Bejamin Franklin)

-------------------------( today )--------------------------
if you fail to plan,
for failure, you are planning
to fail as an engineer...
            (Software developer engineer)

------------------
Errors kinds
------------------
    1. Syntax error...: Code written with errors into the same code.
    2. Logical error..: Code written without errors, but doesn't to do required expectations.
    3. Use error......: Depend on the bad use from the end users.
                        For this kind errors we uses try...except sentences to avoid the program crash.
*/
public class corrida_00
{
    public static void main(String[] args)
    {
        // Printing the Java exception error
        System.out.println("Impresión de las excepciones mas comunes en Java.");

        // ArithmeticException: Thrown when an exceptional condition occurs during an arithmetic operation
        // (e.g., division by zero).
        int a = 10, b = 0;
        try
        {
            int c = a / b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Excepción aritmetica: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException: Thrown when an array has been accessed with an illegal index.
        int[] arr = new int[5];
        try
        {
            arr[5] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Excepción por fuera de rango (vectores): " + e.getMessage());
        }

        // NullPointerException: Thrown when an application attempts to use null in a case where an object is required.
        String str = null;
        try
        {
            System.out.println(str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("Excepción por uso de Nulos: " + e.getMessage());
        }

        // NumberFormatException: Thrown when the application is trying to convert a string into one of the numeric
        // types, but that the string does not have the appropriate format.
        String str2 = "abc";
        try
        {
            int num = Integer.parseInt(str2);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Excepción por formato de número: " + e.getMessage());
        }

        // StringIndexOutOfBoundsException: Thrown by String class methods to indicate that an index is either negative
        // or greater than the size of the string.
        String str3 = "hello";
        try
        {
            char ch = str3.charAt(10);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Excepción por fuera de rango (texto): " + e.getMessage());
        }

        // ClassCastException: Thrown when an object is cast to an incompatible class.
        Object obj = new Integer(100);
        try
        {
            String str4 = (String)obj;
        }
        catch (ClassCastException e)
        {
            System.out.println("Excepción por conversión de tipo: " + e.getMessage());
        }

        // Creates a complete demonstration of the use of the java exception handling mechanism.
        try
        {
            String var1 = "Java";
            int num1 = 4;
            int result = num1 / Integer.parseInt(var1);
            System.out.println("El resultado es: " + result);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Excepción aritmetica: " + e.getMessage());

        }
        catch (Exception e)
        {
            System.out.println("Excepción general: " + e.getMessage());

        }
        finally
        {
            System.out.println("Este bloque se ejecuta siempre.....!");
        }

    }
}