
package ejerciciost3;

import java.util.Scanner;

/**
 * Solicita al usuario un numero n y dibuja un triangulo de base y altura n, de la forma (para n igual a 4)
 */
public class Ejerciciost303 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para el triangulo:");
        int n = sc.nextInt();
        
        //Bucle for para sacar los asteriscos
        
        //Asteriscos en vertical
        for (int i = 0; i < n; i++) {
            //For para mover los asteriscos
            for (int k = 0; k <= n-i; k++) {
                System.out.print(" ");
            }
            //steriscos en horizontal
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");   
            }
            
        System.out.println();
        }
        
        
        
        
    }
 
}
    

