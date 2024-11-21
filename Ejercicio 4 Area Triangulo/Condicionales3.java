
package condicionales2.pkg3;

import java.util.Scanner;

/**
 * Escribe una aplicacion que solicite por consola dos numeros reales que corresponden a la base y altura de un triangulo.
 * Debera mostrarse su area, comprobando que los numeros introducidos por el usuario no son negativos, algo que no tendria sentido.
 * 
 */
public class Condicionales3 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base del triangulo:");
        int base = sc.nextInt();
        System.out.println("Altura del triangulo:");
        int altura = sc.nextInt();
        
        
        if (base>0&&altura>0){
            int area = (base*altura)/2;
            System.out.println("El area del triangulo es: "+area);
        }else{
            System.out.println("Los datos introducidos no son validos.");
        }
        
        
    }
    
}
