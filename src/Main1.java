public class Main1 {
    public static void main(String[] args) {
        String path = "home/user/index.html";

        // Posición de la última barra y del último punto
        int barra = path.lastIndexOf('/');
        int punto = path.lastIndexOf('.');

        // Extensión: desde el punto + 1 hasta el final
        String extension = path.substring(punto + 1);

        // Nombre: desde la barra + 1 hasta el punto
        String nombre = path.substring(barra + 1, punto);

        System.out.println("Extensión: " + extension);
        System.out.println("Nombre: " + nombre);
    }
}