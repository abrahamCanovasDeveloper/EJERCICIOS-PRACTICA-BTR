
package ejerciciost3;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario las distintas cantidades de dinero que dispone.
 * El programa mostrara la suma total de dinero de la que dispone el usuario.
 * La manera de especificar que no desea introducir mas dinero es mediante el cero.
 */
public class EjerciciosT301 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuanto dinero dispones?: ");
        int dinero = sc.nextInt();
        int sumaDinero = 0;
        while (dinero!=0){
            sumaDinero += dinero;
            System.out.println("Tiene mas dinero?:");
            dinero = sc.nextInt();
        }
        System.out.println("Ha terminado de ingresar dinero y usted tiene "+sumaDinero+" euros");
    }
    
}
