import java.util.Scanner;

public class FuncionPar {

    // Función para saber si un número es par
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.print("Proporciona un número: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("¿Tu número es par? " + esPar(numero));
    }
}
