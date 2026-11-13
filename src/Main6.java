import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica cuál de las siguientes opciones no es un tipo primitivo en Java:");
        System.out.println("a. int");
        System.out.println("b. char");
        System.out.println("c. boolean");
        System.out.println("d. String");

        String respuesta = teclado.nextLine().trim().toLowerCase();

        if (!respuesta.equals("a") && !respuesta.equals("b")
                && !respuesta.equals("c") && !respuesta.equals("d")) {
            System.out.println("Respuesta no válida: a, b, c, d");
        } else if (respuesta.equals("d")) {
            System.out.println("Respuesta correcta!");
        } else {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: d");
        }
    }
}