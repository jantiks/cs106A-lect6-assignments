/*
Hailstone sequence class
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
    public void run() {
        int number = readInt("enter number ");
        while (number != 1) {
            if (number % 2 == 0) {
                int old = number;
                number /= 2;
                println(old + " is eveen so i make half " + number);
            } else {
                int old = number;
                number = (number * 3) + 1;
                println(old + " is odd so i make 3n + 1 " + number);
            }
        }
    }
}
