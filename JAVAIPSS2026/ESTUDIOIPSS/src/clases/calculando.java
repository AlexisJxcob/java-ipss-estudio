package clases;

public class calculando {
    int A,B;
    public void setA(int A) {
        this.A = A; // hace referencia a algo de la clase
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getA() {
        return this.A;
    }

    public void sumar () {
        int suma = A + B;
        System.out.println("la suma es: " + suma);
    }

    public int resta (int A, int B){
        int resta = A - B;
        System.out.println("la resta es: " + resta);
        return resta;
    }
}
