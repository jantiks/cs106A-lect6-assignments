/*
Pythagorean theorem
 */

import acm.program.*;

public class Pythagorean extends ConsoleProgram {
    public void run () {
        int a = readInt("a: ");
        int b = readInt("b: ");
        double c = Math.sqrt((a * a) + (b * b));

        println("c = " + c);

    }
}
