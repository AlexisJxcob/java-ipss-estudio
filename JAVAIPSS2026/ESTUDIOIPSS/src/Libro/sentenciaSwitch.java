package Libro;
import java.util.Scanner;

public class sentenciaSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese uh numero de mes");
        int mes = entrada.nextInt();
        switch (mes) { // dentro del switch va la variable que revisara switch
            case 1:
                System.out.println("enero");
                break;



        }
    }
}
