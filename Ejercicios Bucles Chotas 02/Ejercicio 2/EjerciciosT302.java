
package ejerciciost3;

import java.util.Scanner;

/**
 * Para dos numeros dados, a y b, es posible buscar el maximo comun divisor mediante un algoritmo ineficiente pero sencillo:
 * desde el menor de a y b, ir buscando, de forma decreciente, el primer numero que divide a ambos simultaneamente.
 * Realiza un programa que calcule el maximo comun divisor de dos numeros.
 */
public class EjerciciosT302 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de a:");
        int a = sc.nextInt();
        System.out.println("Valor de b:");
        int b =sc.nextInt();
        int divisor=1;
        int mcd = Math.min(a, b);
        boolean comun = false;
        while (divisor<mcd){
               if (a%mcd==0&&b%mcd==0) {
                divisor=mcd;
                comun = true;
            }
            mcd--;
        }
        System.out.println("El maximo comun divisor de "+a+" y de "+b+" es: "+divisor);
        
        
       
        
            
        }
       
       
       
    }
    
    

