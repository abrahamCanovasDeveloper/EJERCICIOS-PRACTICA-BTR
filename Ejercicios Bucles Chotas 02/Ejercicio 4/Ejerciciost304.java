
package ejerciciost3;

import java.util.Scanner;

/**
 * El programa debe pedir al usuario cuantas personas quiere clasificar segun su edad.
 * Luego, se le solicitara las edades de las personas.
 * Al final, el programa debe contar y mostrar cuantas personas son:
 * Menores de edad (menos de 18 años)
 * Mayores de edad (entre 18 y 35 años inclusive)
 * Mayores de 35 años.
 */
public class Ejerciciost304 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas va a clasificar?");
        int numPersona = sc.nextInt();
        int menor = 0;
        int mayorEdad = 0;
        int mayor35 = 0;
        
        for (int i = 0; i < numPersona; i++) {
            System.out.println("Cuales son sus edades?");
            int edad = sc.nextInt();
            if (edad<18) {
               menor++;
            }else if (edad>=18&&edad<=35) {
                mayorEdad++;
            }else if (edad>35) {
                mayor35++;
            }
        }
        System.out.println("Hay "+menor+" personas menores de edad,"+mayorEdad+" personas mayores de edad y "+mayor35+" personas mayores de 35");
    }
    
}
