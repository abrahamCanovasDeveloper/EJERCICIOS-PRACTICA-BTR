import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;
import static java.util.Collections.max;

public class Main {
    public static void main(String[] args) {

        int numA = 225;
        int numB = 150;

        int commonDivisor = 1;
        List<Integer> commonDivisorList = new ArrayList<>();

        // Check all nums until reach the min number between both
        while (commonDivisor <= min(numA, numB)){
            // Set var to save state of divisible. Default False
            Boolean divisorA = Boolean.FALSE;
            Boolean divisorB = Boolean.FALSE;

            if(numA % commonDivisor == 0){
                divisorA = Boolean.TRUE;
            }
            if(numB % commonDivisor == 0){
                divisorB = Boolean.TRUE;
            }

            // If both are divisible adding to list of common divisor
            if(divisorA && divisorB){
                commonDivisorList.add(commonDivisor);
            }

            // Sum up 1 to the possible common divisor
            commonDivisor += 1;
        }

        System.out.println("Max common divisor of " + numA +" and " +numB + " is: "+ max(commonDivisorList));

    }
}