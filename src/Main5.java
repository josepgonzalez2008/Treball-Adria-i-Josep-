import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del universo", "Mi universo", "Patria", "De mayor quiero ser feliz", "Empieza por los zapatos"};

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a nuestra biblioteca");
        System.out.println("Escribe palabra o palabras del título del libro que quieres buscar:");
        String busqueda = input.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println(catalogo[i]);
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("No se ha localizado ningún libro");
        }
    }
}