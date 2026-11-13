import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del universo", "Mi universo", "Patria", "De mayor quiero ser feliz", "Empieza por los zapatos"};

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a nuestra biblioteca");
        System.out.println("Escribe el título del libro que quieres buscar:");
        String titulo = input.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < catalogo.length; i++) {
            // equalsIgnoreCase no tiene en cuenta mayúsculas/minúsculas
            if (catalogo[i].equalsIgnoreCase(titulo)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Se ha localizado el libro");
        } else {
            System.out.println("No se ha localizado el libro");
        }

    }
}