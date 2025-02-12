public class FuncionRecursiva {
    // Imprimir 1 al 5 usando una función recursiva
    static void funcionRecursiva(int numero) {
        // Caso Base
        if(numero == 1)
            System.out.print(numero + " ");
        else {
            // Caso recursiva
            System.out.print(numero + " "); // Si queremos que se imprima de manera descendente (ya que primer imprime y luego llama la función, no dejando nada pendiente)
            funcionRecursiva(numero - 1);
            //System.out.print(numero + " "); // Si queremos que se imprima de manera ascendente (ya que primero se llama a la función dejando en pendiente la impresión y, cuando llegue a su caso base (cuando es 1), comenzará a imprimir lo que se dejó en pendiente de cada función)
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}

/*
 * NOTAS:
 * Una función recursiva es una función que se llama así misma tantas veces cómo sea necesario
 * Existen reglas para crear funciones recursivas:
 * 1. Una función que se llama así misma
 * 2. Debe de avanzar hacia un caso base, de lo contrario caemos en ciclos infinitos (con cada llamada recursiva nos acercamos al caso base)
 * Cuando una función recursiva llega a su caso base, comenzará a ejecutar lo que dejó en pendiente las demás líneas que están después de que la función se llame así misma, yendo hacia atrás
 */