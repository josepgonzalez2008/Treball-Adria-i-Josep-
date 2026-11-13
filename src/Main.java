public class Main {
    public static void main(String[] args) {
        double d = 858.48;

        // valueOf es estático: convierte el double en el texto "858.48"
        String s = String.valueOf(d);

        // indexOf es de instancia: posición del punto (3)
        int dot = s.indexOf('.');

        System.out.println(dot + " digits before decimal point");

        // length es de instancia: longitud del texto (6)
        System.out.println((s.length() - dot - 1) + " digits after decimal point");
    }
}
