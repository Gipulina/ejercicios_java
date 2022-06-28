
public class DivideNumeros {

    public static void main(String[] args) {
        int a =33;
        int b=14;
        int div;
        div=(a>b)?a/b:b/a; //operador ternario: hace la comparación.

        System.out.println("El resultado de la division de" + a + " y "+ b + "es igual a " + div);

    }
}