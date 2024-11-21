
package tema3ejercicios;

import java.util.Scanner;

/**
 *
 *
 */
public class Tema3Ejercicios {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura del arbol(en centimetros):");
        int altura = sc.nextInt();
        int alturaMaxima = 0;
        int cantidadArbol = -1;
        int numArbol = 0;
        
        while (altura!=-1){
            cantidadArbol++;
                
            if (altura>alturaMaxima){
                    alturaMaxima = altura;
                    numArbol = cantidadArbol;
                
                }
            System.out.println("Introduzca la altura del arbol(en centimetros):");
            altura = sc.nextInt();
        }
        System.out.println("El arbol mas alto es el numero: "+numArbol+ " y mide: "+alturaMaxima);
    }
    
}
