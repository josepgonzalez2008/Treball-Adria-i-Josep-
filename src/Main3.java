import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = input.nextLine();

        if (texto.length() == 0) {
            // Texto vacío: el programa termina
            System.out.println("El texto está vacío.");
        } else {
            System.out.print("Introduce una palabra a buscar: ");
            String palabra = input.nextLine();

            if (texto.contains(palabra)) {
                System.out.println("La palabra se ha localizado en el texto.");
            } else {
                System.out.println("La palabra no se ha localizado en el texto.");
            }
        }
    }
}