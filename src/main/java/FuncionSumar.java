public class FuncionSumar {
    // Definimos la función de sumar
    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;

        var resultado = sumar(arg1, arg2);
        System.out.println("resultado = " + resultado);

        resultado = sumar(10, 20);
        System.out.println("resultado = " + resultado);
    }
}
