
package condicionales2.pkg4;

import java.util.Scanner;

/**
 * Utiliza el operador ternario para calcular el valor absoluto de un numero que se solicita al usuario por teclado.
 * 
 */
public class Condicionales4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero:");
        int num = sc.nextInt();
        int valor;
        valor = num>=0 ? num:num*-1;
        System.out.println("El valor absoluto de "+num+" es: "+valor);
    }
    
}
