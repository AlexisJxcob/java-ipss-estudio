package clases;

import java.util.Scanner; // Referencia al Scanner antes de ocuparlo

/**
 * @author Jacob
 */
public class INCIO { // clase principal

    public static void main(String[] args) { // Punto de entrada del programa es obligarorio
        System.out.println("Hola Java!"); // primer print

                // --- Primera parte: Variables ---
        int n1; // Declaración
        int n2;
        n1 = 88; // Asignación
        n2 = 22;
        int suma = n1 + n2; // Suma de variables

        System.out.println("la suma es: " + suma); // Concatenación

        System.out.print("La suma es: "); // print común no hace salto de línea
        System.out.println(suma);

        System.out.println("La suma es: "); // println sí hace salto de línea
        System.out.println(suma);

          // ==== clase para sumar 2 enteros ====
        // --- Segunda parte: Scanner ---

        // Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);
        calculando objeto = new calculando();

        System.out.println("Ingrese el primer numero:"); // Pedimos los datos
        int obj1 = leer.nextInt(); // Guardamos los datos en una variable

        System.out.println("Ingrese el segundo numero:");
        int obj2 = leer.nextInt();

        // Sumamos las variables respetando las minúsculas
        int sumaScanner = obj1 + obj2;
        System.out.println("la suma de tus 2 numeros es: " + sumaScanner);

        objeto.

        leer.close(); // Cerramos el Scanner
    } // fin del main
} // fin de la clase

