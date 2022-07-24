import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      /*
      * Solicitar al usuario dos valores:

numero1 (int)

numero2 (int)

Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):

Proporciona el numero1:
Proporciona el numero2:
El numero mayor es:
<numeroMayor>
* */

        int valor1;
        int valor2;
        int resultado;
        Scanner a = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        valor1 = Integer.parseInt(a.nextLine());

        System.out.println("Proporciona el numero2:");
        valor2 = Integer.parseInt(a.nextLine());

        if (valor1 > valor2){
            resultado = valor1;
        } else {
            resultado = valor2;
        }
        System.out.println("El numero mayor es: "+resultado);

    }
}
