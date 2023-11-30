public class funcion2 {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numeroAVerificar = 10;

        if (esPar(numeroAVerificar)) {
            System.out.println(numeroAVerificar + " es un número par.");
        } else {
            System.out.println(numeroAVerificar + " es un número impar.");
        }
    }
}
