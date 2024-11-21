
package tema2ejercicios;

import java.util.Scanner;

/**
 * En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales. El numero de animales que alimentar es numAnimales
 * y sabemos que cada animal come una media de "KilosPorAnimal"
 * Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal.
 * En caso negativo, ha de calcular cual es la racion que corresponde a cada uno de los animales.
 * 
 */
public class Condicionales2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos kilos de comida se han comprado?:");
        double comidaDiaria = sc.nextDouble();
        System.out.println("Cuantos animales hay para alimentar:");
        double numAnimales = sc.nextDouble();
        System.out.println("Cuantos kilos de media comen los animales?:");
        double KilosPorAnimal = sc.nextDouble();
        double kilosNecesarios = comidaDiaria/numAnimales;
        
        if (comidaDiaria>=numAnimales&&KilosPorAnimal<=1){
            System.out.println("Tenemos alimento suficiente para los animales de la granja");
        }else {  
            System.out.println("Falta alimento. Cada animal necesita "+kilosNecesarios+"kg de comida como racion.");
        }
        
        
        
    }
    
}
