public class Funciones {

    static void saludar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        saludar("Hola desde Java");
        saludar("Adios");
        saludar("XD");
    }
}

/*
 * NOTAS:
 * Las funciones son partes de código reutilizables
 * La notación public en las funciones, permite que sean utilizadas en otros archivos
 * La notación void en las funciones indica que esa función no retornará un valor
 * Las funciones pueden o no recibir datos de entradas, cómo pueden o no retornar valores
 * La notación static nos facilita el llamado de una función sin tener que crear un objeto para ahí recién llamar la clase
 * El uso principal de un metodo estático en Java es que pertenece a la clase y, por tanto, se puede llamar sin crear un objeto de esa clase
 * El dato que pasamos a la función se le conoce cómo argumento y el dato que necesita una función son parámetros
 */