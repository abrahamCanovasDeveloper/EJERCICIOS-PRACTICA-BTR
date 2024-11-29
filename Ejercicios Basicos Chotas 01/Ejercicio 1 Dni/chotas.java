
package condicionales2.pkg1;

import java.util.Scanner;

/**
 * Diseña una aplicacion en la que, dado un numero de DNI, calcule la letra que le corresponde.
 * Observa que un numero de 8 digitos esta dentro del rango int.
 * 
 */
public class Condicionales1 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su DNI:");
        int dni = sc.nextInt();
        int letra = dni%23;
        
        switch(letra){
            case 0:
                System.out.println("La letra de tu DNI es la T");
                break;
            case 1:
                System.out.println("La letra de tu DNI es la R");
                break;
            case 2:
                System.out.println("La letra de tu DNI es la W");
                break;
            case 3:
                System.out.println("La letra de tu DNI es la A");
                break;
            case 4:
                System.out.println("La letra de tu DNI es la G");
                break;
            case 5:
                System.out.println("La letra de tu DNI es la M");
                break;
            case 6:
                System.out.println("La letra de tu DNI es la Y");
                break;
            case 7:
                System.out.println("La letra de tu DNI es la F");
                break;
            case 8:
                System.out.println("La letra de tu DNI es la P");
                break;
            case 9:
                System.out.println("La letra de tu DNI es la D");
                break;
            case 10:
                System.out.println("La letra de tu DNI es la X");
                break;
            case 11:
                System.out.println("La letra de tu DNI es la B");
                break;
            case 12:
                System.out.println("La letra de tu DNI es la N");
                break;
            case 13:
                System.out.println("La letra de tu DNI es la J");
                break;
            case 14:
                System.out.println("La letra de tu DNI es la Z");
                break;
            case 15:
                System.out.println("La letra de tu DNI es la S");
                break;
            case 16:
                System.out.println("La letra de tu DNI es la Q");
                break;
            case 17:
                System.out.println("La letra de tu DNI es la V");
                break;
            case 18:
                System.out.println("La letra de tu DNI es la H");
                break;
            case 19:
                System.out.println("La letra de tu DNI es la L");
                break;
            case 20:
                System.out.println("La letra de tu DNI es la C");
                break;
            case 21:
                System.out.println("La letra de tu DNI es la K");
                break;
            case 22:
                System.out.println("La letra de tu DNI es la E");
                break;
            default:
                System.out.println("El DNI introducido no es valido.");
        }
        
        
    }
    
}
