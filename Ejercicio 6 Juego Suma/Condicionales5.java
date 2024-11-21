
package condicionales2.pkg5;

import java.util.Scanner;

/**
 * Realiza el "juego de la suma", que consiste en que aparezcan dos numeros aleatorios (comprendidos entre 1 y 99) que el usuario que sumar.
 * La aplicacion debe indicar si el resultado de la operacion (introducido por el usuario) es correcto o no.
 * 
 */
public class Condicionales5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random()*100-1);
        int num2 = (int) (Math.random()*100-1);
        System.out.println("Cual es la suma de "+num1+" y "+num2+" ?");
        int suma = sc.nextInt();
        
        if (suma==num1+num2){
            System.out.println("La suma es correcta.");
        }else{
            System.out.println("Te has equivocado. Intentalo de nuevo.");
        }
    }
    
}
