import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class MayorNumero {
        public static void main(String[] args) {
                int a = 100;
                int b = 45;
                if (a > b) {
                    System.out.println("El mayor es " + a);
                } else if (a < b) {
                    System.out.println("El mayor es " + b);
                } else {
                    System.out.println("Los numeros son iguales");
                }
            }
            public class SegundaParte{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingresa el primer número");
                int primer_num = scanner.nextInt();

               Scanner scan = new Scanner(System.in);
                System.out.println("Ingresa el segundo número");
                int segundo_num = scanner.nextInt();

                if(primer_num == segundo_num){
                  System.out.println("Ambos numeros son iguales");
                }else if(primer_num == segundo_num ){
                    System.out.println("El primer numero es mayor que el segundo");
                }else{
                   System.out.println("El primer numero es menor que el segundo");
                //}
            }
        }
}