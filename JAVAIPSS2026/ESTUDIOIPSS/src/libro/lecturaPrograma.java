package libro;
import java.util.Scanner;

public class lecturaPrograma {
    public static void main(String[] args){
        Scanner lecturaNumero = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Ingrese un numero entero: ");
        numero1 = lecturaNumero.nextInt(); // espera que el usuario ingrese un numero y apriete enter

        System.out.println("Ingrese otro numero entero: ");
        numero2 = lecturaNumero.nextInt();

        System.out.println(numero1 + " Es mayor a " + numero2 + ": " );
        System.out.println(numero1 > numero2);

    }
}
