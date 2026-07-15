package clases;

import java.util.Scanner;

public class clase {
    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner leer = new Scanner(System.in);

        // Creamos el objeto de tu clase calculando
        calculando objetito = new calculando();

        System.out.println("Ingrese el primer numero:");
        int obj1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int obj2 = leer.nextInt();
        objetito.sumar();
        System.out.println(objetito.getA());
    }
}