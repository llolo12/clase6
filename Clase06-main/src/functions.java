/*=================================================================================
Study Center....: Universidad Técnica Nacional
Campus..........: Pacífico (JRMP)
College career..: Ingeniería en Tecnologías de Información
Period..........: 2C-2024
Course..........: ITI-221 - Programación I
Document........: class_05 - functions.java
Goals...........: Use functions from the external library to generate random data
                  and print it in a table format.
Professor.......: Jorge Ruiz (york)
Student.........: Cristhian Bonilla Rojas
=================================================================================*/

// Call external libraries
import java.util.Random;

public class functions
{

    // Refill with zeros on the left side of the expression, only if required
    public String ponCeros(String Expre, int tam)
    {
        String local = "";
        for(int i = 0; i < (tam-Expre.length()); i++)
        {
            local = local.concat("0");
        }
        return local.concat(Expre);
    }

    // Print horizontal line, applying length and custom character
    public void impLinea(int largo, char tipo)
    {
        for(int i = 1; i <= largo; i++)
        {
            System.out.print(tipo);
        }
        System.out.println();
    }

    // Returns a random single first name
    public String Nombre()
    {
        Random rnd = new Random();
        String nombres[] =
        {
                "Ana","Alvaro","Adriana","Arturo","Alfonso","Andrea","Andres","Anete","Arelys","Armando","Antonio","Andrey",
                "Alicia","Ariel","Astrid","Aurora","Aldo","Amanda","Alejandro","Ariana","Ariela","Alexander",
                "Bianka","Beverly","Bruno","Braulio","Beatriz","Bernarda","Brenda","Bryan","Boris","Berta","Bartolome","Baltazar","Brandon","Braylin",
                "Cesar","Carolina","Carmen","Carlos","Cindy","Camilo","Clemencia","Cecilia","Cristina","Cristian","Catalina","Cristobal", "Cristal",
                "Diego","Dunia","David","Debora","Deisi","Diana","Danilo","Damaris","Doris","Daniel","Denis","Dulce","Dayana",
                "Efrain","Elsa","Elena","Ever","Ernesto","Eduardo","Esgardo","Emilio","Eilin","Esteban","Estiven","Elizabeth","Eneida","Edu",
                "Fabiola","Fernando","Francisco","Francini","FÃ©lix","Federico","Fabricio","Filomena","Franklin","Fernanda","Fran",
                "Gabriela","Gerardo","Giovanna","German","Grisel","Gabriel","Gustavo","Gilberto","Graciela",
                "Hector","Hellen","Huberth","Humberto","Hilda","Homero","HernÃ¡n","Hugo","Hellen",
                "Ignacio","Indira","Irma","Ingrid","Isaias","Ivania","Ileana","Isac","Isidro",
                "Jorge","Joyce","Julia","Jessica","JosÃ©","Julio","Jacinto","Jaime","Joel","Jairo","Jesenia","Juan","Jesus","Juana","Jael","Josue",
                "Karla","Karen","Katia","Kevin","Kenneth","Katerina","Keylor","Kenyi","Karina","Kamila","Katherine","Kendall","Kendry","Kendrick",
                "Lorena","Lorenzo","Lady","Luis","Laura","Lucas","Lourdes","Leopoldo","Licet","Leticia",
                "Mario","Mauricio","Melania","Marianela","Mercedes","Marcos","Merlina","Morticia","Mauren","Miguel","Monica","Mauricio","Marienny",
                "Nuria","Nestor","Nazaret","Nidia","Norman","Naomi","Nora",
                "Osvaldo","Orlando","Odir","Olga","Ofelia","Omar","Olger","Oscar","Olivier",
                "Pedro","Pablo","Patricia","Priscila","Paula","Paola","Pericles","Paolo",
                "RaÃºl", "Roberto", "Rebeca","Rocio","Rena","Rosaura","Rosalia","Rosa","Romel","Ricardo","Rigoberto",
                "Sabrina", "Sergio", "Sonia","Samuel","Sandra","Silvio","Susana","Sebastian","Sandro","Silvia","Sofia","Santiago","Santos","Saul",
                "Sofonias","Samiel","Simey","Sharon",
                "Tatiana","Teodoro", "Tania","Teresa","Tobias","Tonny",
                "Ursula", "Uriel", "Ulises",
                "Veronica","Vanesa","Valeria","Victor","Vilma","Vernon","Viviana","Victoria","Valery","Valeska",
                "Walter","Wilfrido","Wendy","William","Wenceslao","Wilgem","Wilberth","Willis",
                "Xiomara", "Ximena", "Xavier",
                "Yirlania","Yolanda","Yonan","Yehudi","Yvone","Yurielka","Yuri","Yenori",
                "Zaida", "Zulema","Zoe","Zacarias","Zoraida","Zeidy"
        };
        return nombres[rnd.nextInt(nombres.length)];
    }

    // Returns a random last name
    public String Apellido()
    {
        Random rnd = new Random();
        String apellidos[] =
        {
                "Alvarado","Almengor","Acevedo","Abarca","Angulo","Acón","Apuy","Alfaro","Artiaga","Alvares","Arias","Aguilar","Aguero","Aguirre",
                "Aguilera","Araya","Alvarado","Aragon",
                "Ballesteros","Barahona","Barboza","Blanco","Bolaños","Bermudez","Barrantes","Brenes","Blandon","Bonilla",
                "Caballero","Cespedes","Campos","Chavarria","Cubero","Cernas","Cubillo","Cambronero","Cabalceta","Cortes","Con","Carranza","Cordero",
                "Cruz","Cascante","Cordoba","Chaves","Conejo","Cerdas","Castro",
                "Duarte","Duran","Domingues","De la O","Díaz",
                "Elizondo","Echandi","Escalante","Espinoza","Esquivel","Estupian",
                "Fernandez","Fonseca","Fournier","Fajardo","Flores","Fuentes",
                "Gonzalez","Gaitan","Galan","Gambóa","Garcia",
                "Hernández","Herrera","Hidalgo","Huertas","Hurtado",
                "Ibarra","Ibanez","Iglesias","Infante","Izaguirre",
                "Jerez","Jaon","Jimenez","Jacamo","Juarez",
                "Lopez","Lamas","Lagos","Labrador","Lara","Li","Leitan",
                "Madrigal","Molina","Mendez","Manzanares","Monestel","Molinares","Matarrita","Mata","Monge","Mora","Murillo","Mena","Marin","Mendoza","Matamoros",
                "Nuez","Noguera","Naranjo","Navas","Nicolas",
                "Ocampo","Obregon","Ochoa","Ojeda","Ordoez",
                "Pacheco","Palacios","Palma","Padilla","Paniagua","Pomares","Picado","Perez","Peraza","Pizarro","Parra",
                "Quiros","Quintero", "Quintana","Quiroga","Quintanilla","Quesada",
                "Ruiz","Ramirez","Roldan","Redondo","Rivera","Rodriguez","Reyes","Rueda",
                "Saborio","Sanchez","Salas","Saenz","Sancho","Sanabria","Soto","Sequeira","Sibaja","Solano",
                "Talavera","Tenorio","Trujillo","Tijerino","Torres",
                "Ulloa","Ugalde","Ureña","Urbina","Ugarte",
                "Vega","Vargas","Valencia","Vallejo","Varela","Vizcaino","Valdez","Vindas","Villalobos","Villanueva","Villegas","Villagra",
                "Williams","Wright","Wong","Walker","Watson","Wells","White","Ward","Wheeler","Warren","Wade","Walters","Waltz",
                "Zamora","Zarate","Zumbado"
        };
        return apellidos[rnd.nextInt(apellidos.length)];
    }

    // Creates a cedula or identification number
    public int Cedula()
    {
        String ced;
        Random rnd = new Random();

        ced = String.valueOf(rnd.nextInt(7) + 1);
        ced = ced.concat(ponCeros(String.valueOf(rnd.nextInt(1000)), 4) + ponCeros(String.valueOf(rnd.nextInt(1000)), 4));

        return Integer.parseInt(ced);
    }

    // Select a random biological sex
    public char Sexo()
    {
        Random rnd = new Random();
        char Sx[] = {'F','M'};
        return Sx[rnd.nextInt(2)];
    }

    // Creates a civil status
    public char estCivil()
    {
        Random rnd = new Random();
        char Es[] = {'S','C','D','V','U'};
        return Es[rnd.nextInt(5)];
    }

    // Creates a birthdate
    public String fecNac()
    {
        Random rnd = new Random();
        String expre;

        //Calculate day between 1 and 31
        expre = ponCeros(String.valueOf(rnd.nextInt(31)+1),2)+"/";

        //Calculate month between 1 and 12
        expre = expre.concat(ponCeros(String.valueOf(rnd.nextInt(12)+1),2)+"/");

        //Calculate year since 1960 at today
        expre = expre.concat(String.valueOf(rnd.nextInt(59)+1960));

        return expre;
    }//End fecNac function

}