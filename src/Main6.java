import java.util.Scanner;
public class Main6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] preguntas = {
                "¿Cuál de estos tipos es primitivo en Java?",
                "¿Cuál es la extensión de un archivo fuente de Java?",
                "¿Qué palabra se usa para declarar una clase en Java?",
                "¿Cuál es el método de entrada de un programa Java?",
                "¿Qué tipo almacena números enteros?",
                "¿Qué símbolo termina normalmente una instrucción Java?",
                "¿Qué operador comprueba si dos valores son iguales?",
                "¿Qué valores puede almacenar una variable boolean?",
                "¿Qué palabra se usa para crear un objeto en Java?",
                "¿Qué instrucción muestra texto en la consola?",
                "¿Qué tipo se usa para almacenar un carácter?",
                "¿Cuál es el resultado de 5 + 3?",
                "¿Qué operador obtiene el resto de una división?",
                "¿Qué estructura permite ejecutar código según una condición?",
                "¿Qué palabra se usa como alternativa a if?",
                "¿Qué operador lógico significa «y»?",
                "¿Qué operador lógico significa «o»?",
                "¿Qué palabra permite repetir código mientras se cumpla una condición?",
                "¿Qué instrucción permite salir de un bucle?",
                "¿Qué instrucción salta a la siguiente iteración de un bucle?",
                "¿Qué tipo puede almacenar números con decimales?",
                "¿Cuál de estos es un número entero?",
                "¿Qué representa null en Java?",
                "¿Qué método compara el contenido de dos cadenas?",
                "¿Qué propiedad indica la cantidad de caracteres de una cadena?",
                "¿Qué método convierte una cadena a minúsculas?",
                "¿Qué método de Scanner lee una línea completa?",
                "¿Qué método de Scanner lee un número entero?",
                "¿Qué palabra indica que un método no devuelve ningún valor?",
                "¿Qué palabra permite acceder a un miembro sin crear un objeto?",
                "¿Qué palabra impide que una variable pueda reasignarse?",
                "¿Qué modificador restringe el acceso a la misma clase?",
                "¿Qué modificador permite acceder desde otras clases?",
                "¿Qué palabra se usa para importar una clase o paquete?",
                "¿Qué palabra se usa para heredar de una clase?",
                "¿Qué palabra se usa cuando una clase implementa una interfaz?",
                "¿Qué palabra hace referencia al objeto actual?",
                "¿Qué palabra llama al constructor de la clase padre?",
                "¿Qué estructura permite elegir entre varios casos?",
                "¿Qué bloque se usa para capturar una excepción?",
                "¿Qué bloque se ejecuta después de try y catch?",
                "¿Qué clase se suele usar para leer datos del teclado?",
                "¿Qué índice tiene el primer elemento de un array?",
                "¿Qué propiedad permite conocer el tamaño de un array?",
                "¿Qué bucle suele usarse para recorrer un array?",
                "¿Qué tipo representa una cadena de texto en Java?",
                "¿Cuál de estas declaraciones crea un array de enteros?",
                "¿Qué valor tiene una variable local int si no se inicializa?",
                "¿Qué palabra devuelve un valor desde un método?",
                "¿Qué herramienta transforma archivos .java en .class?"
        };

        String[][] opciones = {
                {"String", "Integer", "boolean", "Scanner"},
                {".class", ".java", ".js", ".jar"},
                {"class", "define", "new", "object"},
                {"start()", "run()", "main()", "begin()"},
                {"int", "boolean", "char", "String"},
                {":", ".", ";", ","},
                {"=", "==", "!=", ">="},
                {"true o false", "Cualquier texto", "Un carácter", "Solo números"},
                {"this", "class", "new", "import"},
                {"System.out.println()", "Console.read()", "print.out()", "Scanner.println()"},
                {"String", "char", "byte", "boolean"},
                {"2", "8", "15", "53"},
                {"/", "*", "%", "//"},
                {"if", "import", "package", "class"},
                {"otherwise", "else", "then", "next"},
                {"||", "!", "&&", "&|"},
                {"&&", "||", "==", "!"},
                {"while", "switch", "return", "break"},
                {"continue", "break", "return", "exit"},
                {"break", "stop", "continue", "next"},
                {"boolean", "double", "char", "String"},
                {"3.14", "\"7\"", "7", "true"},
                {"El número cero", "Ausencia de referencia a un objeto", "Cadena vacía", "false"},
                {"==", "compare", "equals()", "same()"},
                {"length", "size()", "count", "width"},
                {"toLowerCase()", "lower()", "lowercase()", "toSmall()"},
                {"nextInt()", "nextLine()", "readLine()", "getLine()"},
                {"next()", "nextLine()", "nextInt()", "readInt()"},
                {"null", "empty", "void", "static"},
                {"static", "final", "private", "void"},
                {"static", "final", "const", "fixed"},
                {"public", "protected", "private", "static"},
                {"private", "public", "final", "void"},
                {"include", "using", "import", "package"},
                {"implements", "extends", "inherits", "super"},
                {"extends", "implements", "interface", "inherit"},
                {"super", "self", "this", "current"},
                {"this", "parent", "base", "super"},
                {"switch", "while", "try", "package"},
                {"check", "catch", "error", "except"},
                {"final", "finally", "finish", "default"},
                {"Scanner", "Printer", "Keyboard", "Input"},
                {"1", "-1", "0", "Depende del array"},
                {"length()", "size()", "length", "count()"},
                {"for", "switch", "if", "try"},
                {"char", "String", "Text", "string"},
                {"int numeros[];", "array int numeros;", "numeros int[];", "int numeros();"},
                {"0", "null", "false", "No tiene un valor utilizable"},
                {"break", "return", "yield", "send"},
                {"java", "javac", "javadoc", "jar"}
        };
        String[] respuestasCorrectas = {
                "c", "b", "a", "c", "a", "c", "b", "a", "c", "a",
                "b", "b", "c", "a", "b", "c", "b", "a", "b", "c",
                "b", "c", "b", "c", "a", "a", "b", "c", "c", "a",
                "b", "c", "b", "c", "b", "b", "c", "d", "a", "b",
                "b", "a", "c", "c", "a", "b", "a", "d", "b", "b"
        };

        int numeroPregunta = (int) (Math.random() * preguntas.length);

        System.out.println(preguntas[numeroPregunta]);
        System.out.println("a. " + opciones[numeroPregunta][0]);
        System.out.println("b. " + opciones[numeroPregunta][1]);
        System.out.println("c. " + opciones[numeroPregunta][2]);
        System.out.println("d. " + opciones[numeroPregunta][3]);

        String respuesta = teclado.nextLine().trim().toLowerCase();

        if (!respuesta.equals("a") && !respuesta.equals("b")
                && !respuesta.equals("c") && !respuesta.equals("d")) {
            System.out.println("Respuesta no válida: a, b, c, d");
        } else if (respuesta.equals(respuestasCorrectas[numeroPregunta])) {
            System.out.println("Respuesta correcta!");
        } else {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: "
                    + respuestasCorrectas[numeroPregunta]);
        }
    }
}